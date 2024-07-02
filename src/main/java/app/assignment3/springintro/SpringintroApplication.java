package app.assignment3.springintro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import app.assignment3.springintro.repository.ProductRepository;

@SpringBootApplication
public class SpringintroApplication
	// implementasi ke database melalui JPA
	implements CommandLineRunner
{


	@Autowired
	ProductRepository productRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringintroApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// //create user & address
		// User user = new User();
		// user.setNama("Adinda Zen");
		// user.setEmail("AdindaZen@gmail.com");
		// user.setPassword("12345");

		// Address address = new Address();
		// address.setCity("Jepara");
		// address.setCountry("Indonesia");
		// address.setState("Jawa Tengah");
		// address.setStreet("Jl Pemuda");
		// address.setZipCode("53412");
		// address.setUser(user);

		// userRepository.save(user);
		// logger.info("Berhasil menyimpan user!");

		// addressRepository.save(address);
		// logger.info("Berhasil menyimpan address!");
	}
}
