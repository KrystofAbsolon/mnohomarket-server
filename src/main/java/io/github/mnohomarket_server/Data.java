package io.github.mnohomarket_server;

import java.util.ArrayList;

import io.github.mnohomarket_server.Objects.Market;

public class Data {

    private static final ArrayList<Market> markets = new ArrayList<>();
	private static double credit = 0f;

    public static void loadMarkets() {
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

    public static ArrayList<Market> getMarkets() {
        return markets;
    }

    public static double getCredit() {
        return credit;
    }

    public static void setCredit(double credit) {
        Data.credit = credit;
    }

    
}
