package io.github.mnohomarket_server;

import java.util.ArrayList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.github.mnohomarket_server.Objects.Market;

@SpringBootApplication
public class MnohomarketServerApplication {

	public static ArrayList<Market> markets = new ArrayList<>();

	public static void main(String[] args) {
		SpringApplication.run(MnohomarketServerApplication.class, args);

		markets.add(new Market(
			1,
			"Bude zítra den?",
			99,
			"https://bam-cm-cldigipub-largefs.s3.amazonaws.com/cldigipub/wp-content/uploads/2025/08/shutterstock_2464129821.jpg"
		));
		markets.add(new Market(
			2,
			"Ukončí se Marek do konce roku 2026?",
			89,
			"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSys10LGiTbpboS_qhhVp1KcVlJMVp3-EB1yA&s"
		));
	}
}
