package com.RecOil;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.RecOil.repositories.User;
import com.RecOil.repositories.UserRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserRepositoryTest {

	@Autowired
	UserRepository userRepository;

	// ApplicationContext ctx = new ClassPathXmlApplicationContext(
	// "applicationContext.xml");

	@Before
	public void setUp() {
	}

	@Test
	public void testCount() {
		userRepository.deleteAll();

		final long count = userRepository.count();

		System.out.println("Hay " + count + " usuarios");
	}

	@Test
	public void testCRUD() {

		final User user = new User();
		user.set_id("0");
		user.setAutorizado(true);

		// Insert
		final long pre_count = userRepository.count();
		final User insertedUser = userRepository.insert(user);

		System.out.println("Se ha insertado un user con id "
				+ insertedUser.get_id());

		final long post_count = userRepository.count();

		Assert.assertEquals("0", insertedUser.get_id());
		Assert.assertTrue(post_count == (pre_count + 1));

		// Find
		final User findedUser = userRepository.findBy_id("0");

		System.out.println("Se ha obtenido un user con id "
				+ insertedUser.get_id());

		Assert.assertEquals("0", findedUser.get_id());
		Assert.assertNotNull(findedUser);

		// Update
		insertedUser.setActivo(true);

		final User updatedUser = userRepository.save(insertedUser);

		System.out.println("Se ha actualizado un user con id "
				+ updatedUser.get_id());

		Assert.assertEquals("0", updatedUser.get_id());

		Assert.assertNotNull(updatedUser);

		// Delete
		final User deletableUser = userRepository.findBy_id("0");

		userRepository.delete(String.valueOf(deletableUser.get_id()));

		System.out.println("Se ha borrado un user con id "
				+ updatedUser.get_id());

		final long deleted_count = userRepository.count();

		Assert.assertEquals(deleted_count, pre_count);
	}
}