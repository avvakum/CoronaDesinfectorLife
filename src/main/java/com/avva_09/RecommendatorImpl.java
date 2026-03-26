package com.avva_09;

@Singleton
@Deprecated
public class RecommendatorImpl implements Recommendator {
    @InjectProperty("whisky")
    private String alcohol;

    public RecommendatorImpl() {
        System.out.println("recommendator was created");
    }

    @Override
    public void recommend() {
        System.out.println("to protect from covid-2019 drink " + alcohol);
    }
}
