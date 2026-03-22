package com.avva_06;

@Singleton
public class RecommendatorImpl implements Recommendator {
    @InjectProperty("whisky")
    private String alcohol;

    @Override
    public void recommend() {
        System.out.println("to protect from covid-2019 drink " + alcohol);
    }
}
