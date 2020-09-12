package factory.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;
import patterns.builder.bigmac.Bigmac;
import patterns.builder.bigmac.Bun;
import patterns.builder.bigmac.Ingredients;
import patterns.builder.bigmac.Sauce;

public class BigmacTestSuite {
    @Test
    public void testBigmacNew() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBulider()
                .bun(new Bun(Bun.WITH_SESAME))
                .burgers(2)
                .sauce(Sauce.BARBECUE)
                .ingredient(Ingredients.BECON)
                .ingredient(Ingredients.ONION)
                .ingredient(Ingredients.SALAD)
                .ingredient(Ingredients.PRAWNS)
                .build();
        System.out.println(bigmac);
        //When
        int howManyIngredients = bigmac.getIngredients().size();
        //Then
        Assert.assertEquals(4, howManyIngredients);
    }
}
