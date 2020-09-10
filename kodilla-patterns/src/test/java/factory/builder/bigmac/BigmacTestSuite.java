package factory.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;
import patterns.builder.bigmac.Bigmac;
import patterns.builder.bigmac.Bun;

public class BigmacTestSuite {
    @Test
    public void testBigmacNew() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBulider()
                .ingredient("Onion")
                .bun(Bun.NORMAL)
                .burgers(2)
                .sauce("Spicy")
                .ingredient("Ham")
                .ingredient("Mushrooms")
                .ingredient("Tomato")
                .build();
        System.out.println(bigmac);
        //When
        int howManyIngredients = bigmac.getIngredients().size();
        //Then
        Assert.assertEquals(4, howManyIngredients);
    }
}
