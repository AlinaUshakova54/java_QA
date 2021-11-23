package ru.stga.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.sandbox.Point;

public class PointTests {

    @Test
    public void testDistance() {
        Point p1 = new Point(6,1);
        Point p2 = new Point(2,6);

        Assert.assertEquals(p2.distance(p1), 6.403124237432848);

    }
 }
