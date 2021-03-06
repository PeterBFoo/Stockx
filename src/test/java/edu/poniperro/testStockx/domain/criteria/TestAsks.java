package edu.poniperro.testStockx.domain.criteria;
import edu.poniperro.stockx.domain.criteria.Asks;
import edu.poniperro.stockx.domain.criteria.Criteria;
import edu.poniperro.stockx.domain.item.Ask;
import edu.poniperro.stockx.domain.item.Bid;
import edu.poniperro.stockx.domain.item.Sale;
import edu.poniperro.stockx.domain.item.Sneaker;
import org.junit.Assert;
import org.junit.Test;

public class TestAsks {

    @Test
    public void testAsks() {
        Criteria asks = new Asks();
        Sneaker sneaker = new Sneaker("555088-105", "Jordan 1 Retro High Dark Mocha");
        sneaker.add(new Ask("6", 600));
        sneaker.add(new Sale("6", 600));
        sneaker.add(new Bid("6", 600));

        Assert.assertEquals(1, asks.checkCriteria(sneaker).size());
        Assert.assertTrue(asks.checkCriteria(sneaker).get(0) instanceof Ask);
    }
}
