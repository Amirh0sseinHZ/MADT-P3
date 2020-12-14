package com.example.madt_p3;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorClassUnitTest {

    /*
        Long Negative Int (LNI) => -999999999.9999
        Long Negative Float (LNF) => -999999999
        Short Negative Int (SNI) => -1
        Short Negative Float (SNF) => -0.0001
        Zero => 0
        Short Positive Int (SPI) => 1
        Short Positive Float (SPF) => 0.0001
        Long Positive Int (LPI) => 999999999
        Long Positive Float (LPF) => 999999999.9999
     */

    @Test
    public void Given_LNFandLNF_When_AddIsCalled_Then_ReturnedDoubleLNF(){
        final double givenInput1 = -999999999.9999;
        final double givenInput2 = -999999999.9999;

        final double expectedResult = -1999999999.9998;
        final double actualResult = Calculator.Add(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_LNFandLNI_When_AddIsCalled_Then_ReturnedDoubleLNF(){
        final double givenInput1 = -999999999.9999;
        final double givenInput2 = -999999999;

        final double expectedResult = -1999999998.9999;
        final double actualResult = Calculator.Add(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0.000001);
    }

    @Test
    public void Given_LNFandSNI_When_AddIsCalled_Then_ReturnedDoubleLNF(){
        final double givenInput1 = -999999999.9999;
        final double givenInput2 = -1;

        final double expectedResult = -1000000000.9999;
        final double actualResult = Calculator.Add(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_LNFandSNF_When_AddIsCalled_Then_ReturnedDoubleLNF(){
        final double givenInput1 = -999999999.9999;
        final double givenInput2 = -0.0001;

        final double expectedResult = -1000000000;
        final double actualResult = Calculator.Add(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_LNFandZERO_When_AddIsCalled_Then_ReturnedDoubleLNF(){
        final double givenInput1 = -999999999.9999;
        final double givenInput2 = 0;

        final double expectedResult = -999999999.9999;
        final double actualResult = Calculator.Add(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_LNFandSPI_When_AddIsCalled_Then_ReturnedDoubleLNF(){
        final double givenInput1 = -999999999.9999;
        final double givenInput2 = 1;

        final double expectedResult = -999999998.9999;
        final double actualResult = Calculator.Add(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_LNFandSPF_When_AddIsCalled_Then_ReturnedDoubleLNF(){
        final double givenInput1 = -999999999.9999;
        final double givenInput2 = 0.0001;

        final double expectedResult = -999999999.9998;
        final double actualResult = Calculator.Add(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_LNFandLPI_When_AddIsCalled_Then_ReturnedDoubleSNF(){
        final double givenInput1 = -999999999.9999;
        final double givenInput2 = 999999999;

        final double expectedResult = -0.99989998340607;
        final double actualResult = Calculator.Add(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0.000001);
    }

    @Test
    public void Given_LNFandLPF_When_AddIsCalled_Then_ReturnedDoubleZERO(){
        final double givenInput1 = -999999999.9999;
        final double givenInput2 = 999999999.9999;

        final double expectedResult = 0;
        final double actualResult = Calculator.Add(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_LNIandLNF_When_AddIsCalled_Then_ReturnedDoubleLNF(){
        final double givenInput1 = -999999999;
        final double givenInput2 = -999999999.9999;

        final double expectedResult = -1999999998.9999;
        final double actualResult = Calculator.Add(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0.000001);
    }

    @Test
    public void Given_LNIandLNI_When_AddIsCalled_Then_ReturnedDoubleLNI(){
        final double givenInput1 = -999999999;
        final double givenInput2 = -999999999;

        final double expectedResult = -1999999998;
        final double actualResult = Calculator.Add(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_LNIandSNI_When_AddIsCalled_Then_ReturnedDoubleLNI(){
        final double givenInput1 = -999999999;
        final double givenInput2 = -1;

        final double expectedResult = -1000000000;
        final double actualResult = Calculator.Add(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_LNIandSNF_When_AddIsCalled_Then_ReturnedDoubleLNF(){
        final double givenInput1 = -999999999;
        final double givenInput2 = -0.0001;

        final double expectedResult = -999999999.0001;
        final double actualResult = Calculator.Add(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_LNIandZERO_When_AddIsCalled_Then_ReturnedDoubleLNI(){
        final double givenInput1 = -999999999;
        final double givenInput2 = 0;

        final double expectedResult = -999999999;
        final double actualResult = Calculator.Add(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_LNIandSPI_When_AddIsCalled_Then_ReturnedDoubleLNI(){
        final double givenInput1 = -999999999;
        final double givenInput2 = 1;

        final double expectedResult = -999999998;
        final double actualResult = Calculator.Add(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_LNIandSPF_When_AddIsCalled_Then_ReturnedDoubleLNF(){
        final double givenInput1 = -999999999;
        final double givenInput2 = 0.0001;

        final double expectedResult = -999999998.9999;
        final double actualResult = Calculator.Add(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_LNIandLPI_When_AddIsCalled_Then_ReturnedDoubleZERO(){
        final double givenInput1 = -999999999;
        final double givenInput2 = 999999999;

        final double expectedResult = 0;
        final double actualResult = Calculator.Add(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_LNIandLPF_When_AddIsCalled_Then_ReturnedDoubleSPF(){
        final double givenInput1 = -999999999;
        final double givenInput2 = 999999999.9999;

        final double expectedResult = 0.99989998340607;
        final double actualResult = Calculator.Add(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0.000001);
    }

    @Test
    public void Given_SNIandLNF_When_AddIsCalled_Then_ReturnedDoubleLNF(){
        final double givenInput1 = -1;
        final double givenInput2 = -999999999.9999;

        final double expectedResult = -1000000000.9999;
        final double actualResult = Calculator.Add(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_SNIandLNI_When_AddIsCalled_Then_ReturnedDoubleLNI(){
        final double givenInput1 = -1;
        final double givenInput2 = -999999999;

        final double expectedResult = -1000000000;
        final double actualResult = Calculator.Add(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_SNIandSNI_When_AddIsCalled_Then_ReturnedDoubleSNI(){
        final double givenInput1 = -1;
        final double givenInput2 = -1;

        final double expectedResult = -2;
        final double actualResult = Calculator.Add(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_SNIandSNF_When_AddIsCalled_Then_ReturnedDoubleSNF(){
        final double givenInput1 = -1;
        final double givenInput2 = -0.0001;

        final double expectedResult = -1.0001;
        final double actualResult = Calculator.Add(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_SNIandZERO_When_AddIsCalled_Then_ReturnedDoubleSNI(){
        final double givenInput1 = -1;
        final double givenInput2 = 0;

        final double expectedResult = -1;
        final double actualResult = Calculator.Add(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_SNIandSPI_When_AddIsCalled_Then_ReturnedDoubleZERO(){
        final double givenInput1 = -1;
        final double givenInput2 = 1;

        final double expectedResult = 0;
        final double actualResult = Calculator.Add(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_SNIandSPF_When_AddIsCalled_Then_ReturnedDoubleSNF(){
        final double givenInput1 = -1;
        final double givenInput2 = 0.0001;

        final double expectedResult = -0.9999;
        final double actualResult = Calculator.Add(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_SNIandLPI_When_AddIsCalled_Then_ReturnedDoubleLPI(){
        final double givenInput1 = -1;
        final double givenInput2 = 999999999;

        final double expectedResult = 999999998;
        final double actualResult = Calculator.Add(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_SNIandLPF_When_AddIsCalled_Then_ReturnedDoubleLPF(){
        final double givenInput1 = -1;
        final double givenInput2 = 999999999.9999;

        final double expectedResult = 999999998.9999;
        final double actualResult = Calculator.Add(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_SNFandLNF_When_AddIsCalled_Then_ReturnedDoubleLNF(){
        final double givenInput1 = -0.0001;
        final double givenInput2 = -999999999.9999;

        final double expectedResult = -1000000000;
        final double actualResult = Calculator.Add(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_SNFandLNI_When_AddIsCalled_Then_ReturnedDoubleLNF(){
        final double givenInput1 = -0.0001;
        final double givenInput2 = -999999999;

        final double expectedResult = -999999999.0001;
        final double actualResult = Calculator.Add(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_SNFandSNI_When_AddIsCalled_Then_ReturnedDoubleSNF(){
        final double givenInput1 = -0.0001;
        final double givenInput2 = -1;

        final double expectedResult = -1.0001;
        final double actualResult = Calculator.Add(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_SNFandSNF_When_AddIsCalled_Then_ReturnedDoubleSNF(){
        final double givenInput1 = -0.0001;
        final double givenInput2 = -0.0001;

        final double expectedResult = -0.0002;
        final double actualResult = Calculator.Add(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_SNFandZERO_When_AddIsCalled_Then_ReturnedDoubleSNF(){
        final double givenInput1 = -0.0001;
        final double givenInput2 = 0;

        final double expectedResult = -0.0001;
        final double actualResult = Calculator.Add(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_SNFandSPI_When_AddIsCalled_Then_ReturnedDoubleSPF(){
        final double givenInput1 = -0.0001;
        final double givenInput2 = 1;

        final double expectedResult = 0.9999;
        final double actualResult = Calculator.Add(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_SNFandSPF_When_AddIsCalled_Then_ReturnedDoubleZERO(){
        final double givenInput1 = -0.0001;
        final double givenInput2 = 0.0001;

        final double expectedResult = 0;
        final double actualResult = Calculator.Add(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_SNFandLPI_When_AddIsCalled_Then_ReturnedDoubleLPF(){
        final double givenInput1 = -0.0001;
        final double givenInput2 = 999999999;

        final double expectedResult = 999999998.9999;
        final double actualResult = Calculator.Add(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_SNFandLPF_When_AddIsCalled_Then_ReturnedDoubleLPF(){
        final double givenInput1 = -0.0001;
        final double givenInput2 = 999999999.9999;

        final double expectedResult = 999999999.9998;
        final double actualResult = Calculator.Add(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_ZEROandLNF_When_AddIsCalled_Then_ReturnedDoubleLNF(){
        final double givenInput1 = 0;
        final double givenInput2 = -999999999.9999;

        final double expectedResult = -999999999.9999;
        final double actualResult = Calculator.Add(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_ZEROandLNI_When_AddIsCalled_Then_ReturnedDoubleLNI(){
        final double givenInput1 = 0;
        final double givenInput2 = -999999999;

        final double expectedResult = -999999999;
        final double actualResult = Calculator.Add(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_ZEROandSNI_When_AddIsCalled_Then_ReturnedDoubleSNI(){
        final double givenInput1 = 0;
        final double givenInput2 = -1;

        final double expectedResult = -1;
        final double actualResult = Calculator.Add(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_ZEROandSNF_When_AddIsCalled_Then_ReturnedDoubleSNF(){
        final double givenInput1 = 0;
        final double givenInput2 = -0.0001;

        final double expectedResult = -0.0001;
        final double actualResult = Calculator.Add(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_ZEROandZERO_When_AddIsCalled_Then_ReturnedDoubleZERO(){
        final double givenInput1 = 0;
        final double givenInput2 = 0;

        final double expectedResult = 0;
        final double actualResult = Calculator.Add(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_ZEROandSPI_When_AddIsCalled_Then_ReturnedDoubleSPI(){
        final double givenInput1 = 0;
        final double givenInput2 = 1;

        final double expectedResult = 1;
        final double actualResult = Calculator.Add(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_ZEROandSPF_When_AddIsCalled_Then_ReturnedDoubleSPF(){
        final double givenInput1 = 0;
        final double givenInput2 = 0.0001;

        final double expectedResult = 0.0001;
        final double actualResult = Calculator.Add(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_ZEROandLPI_When_AddIsCalled_Then_ReturnedDoubleLPI(){
        final double givenInput1 = 0;
        final double givenInput2 = 999999999;

        final double expectedResult = 999999999;
        final double actualResult = Calculator.Add(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_ZEROandLPF_When_AddIsCalled_Then_ReturnedDoubleLPF(){
        final double givenInput1 = 0;
        final double givenInput2 = 999999999.9999;

        final double expectedResult = 999999999.9999;
        final double actualResult = Calculator.Add(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_SPIandLNF_When_AddIsCalled_Then_ReturnedDoubleLNF(){
        final double givenInput1 = 1;
        final double givenInput2 = -999999999.9999;

        final double expectedResult = -999999998.9999;
        final double actualResult = Calculator.Add(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_SPIandLNI_When_AddIsCalled_Then_ReturnedDoubleLNI(){
        final double givenInput1 = 1;
        final double givenInput2 = -999999999;

        final double expectedResult = -999999998;
        final double actualResult = Calculator.Add(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_SPIandSNI_When_AddIsCalled_Then_ReturnedDoubleZERO(){
        final double givenInput1 = 1;
        final double givenInput2 = -1;

        final double expectedResult = 0;
        final double actualResult = Calculator.Add(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_SPIandSNF_When_AddIsCalled_Then_ReturnedDoubleSPF(){
        final double givenInput1 = 1;
        final double givenInput2 = -0.0001;

        final double expectedResult = 0.9999;
        final double actualResult = Calculator.Add(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_SPIandZERO_When_AddIsCalled_Then_ReturnedDoubleSPI(){
        final double givenInput1 = 1;
        final double givenInput2 = 0;

        final double expectedResult = 1;
        final double actualResult = Calculator.Add(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_SPIandSPI_When_AddIsCalled_Then_ReturnedDoubleSPI(){
        final double givenInput1 = 1;
        final double givenInput2 = 1;

        final double expectedResult = 2;
        final double actualResult = Calculator.Add(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_SPIandSPF_When_AddIsCalled_Then_ReturnedDoubleSPF(){
        final double givenInput1 = 1;
        final double givenInput2 = 0.0001;

        final double expectedResult = 1.0001;
        final double actualResult = Calculator.Add(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_SPIandLPI_When_AddIsCalled_Then_ReturnedDoubleLPI(){
        final double givenInput1 = 1;
        final double givenInput2 = 999999999;

        final double expectedResult = 1000000000;
        final double actualResult = Calculator.Add(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_SPIandLPF_When_AddIsCalled_Then_ReturnedDoubleLPF(){
        final double givenInput1 = 1;
        final double givenInput2 = 999999999.9999;

        final double expectedResult = 1000000000.9999;
        final double actualResult = Calculator.Add(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_SPFandLNF_When_AddIsCalled_Then_ReturnedDoubleLNF(){
        final double givenInput1 = 0.0001;
        final double givenInput2 = -999999999.9999;

        final double expectedResult = -999999999.9998;
        final double actualResult = Calculator.Add(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_SPFandLNI_When_AddIsCalled_Then_ReturnedDoubleLNF(){
        final double givenInput1 = 0.0001;
        final double givenInput2 = -999999999;

        final double expectedResult = -999999998.9999;
        final double actualResult = Calculator.Add(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_SPFandSNI_When_AddIsCalled_Then_ReturnedDoubleSNF(){
        final double givenInput1 = 0.0001;
        final double givenInput2 = -1;

        final double expectedResult = -0.9999;
        final double actualResult = Calculator.Add(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_SPFandSNF_When_AddIsCalled_Then_ReturnedDoubleZERO(){
        final double givenInput1 = 0.0001;
        final double givenInput2 = -0.0001;

        final double expectedResult = 0;
        final double actualResult = Calculator.Add(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_SPFandZERO_When_AddIsCalled_Then_ReturnedDoubleSPF(){
        final double givenInput1 = 0.0001;
        final double givenInput2 = 0;

        final double expectedResult = 0.0001;
        final double actualResult = Calculator.Add(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_SPFandSPI_When_AddIsCalled_Then_ReturnedDoubleSPF(){
        final double givenInput1 = 0.0001;
        final double givenInput2 = 1;

        final double expectedResult = 1.0001;
        final double actualResult = Calculator.Add(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_SPFandSPF_When_AddIsCalled_Then_ReturnedDoubleSPF(){
        final double givenInput1 = 0.0001;
        final double givenInput2 = 0.0001;

        final double expectedResult = 0.0002;
        final double actualResult = Calculator.Add(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_SPFandLPI_When_AddIsCalled_Then_ReturnedDoubleLPF(){
        final double givenInput1 = 0.0001;
        final double givenInput2 = 999999999;

        final double expectedResult = 999999999.0001;
        final double actualResult = Calculator.Add(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_SPFandLPF_When_AddIsCalled_Then_ReturnedDoubleLPF(){
        final double givenInput1 = 0.0001;
        final double givenInput2 = 999999999.9999;

        final double expectedResult = 1000000000;
        final double actualResult = Calculator.Add(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_LPIandLNF_When_AddIsCalled_Then_ReturnedDoubleSNF(){
        final double givenInput1 = 999999999;
        final double givenInput2 = -999999999.9999;

        final double expectedResult = -0.99989998340607;
        final double actualResult = Calculator.Add(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0.000001);
    }

    @Test
    public void Given_LPIandLNI_When_AddIsCalled_Then_ReturnedDoubleZERO(){
        final double givenInput1 = 999999999;
        final double givenInput2 = -999999999;

        final double expectedResult = 0;
        final double actualResult = Calculator.Add(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_LPIandSNI_When_AddIsCalled_Then_ReturnedDoubleLPI(){
        final double givenInput1 = 999999999;
        final double givenInput2 = -1;

        final double expectedResult = 999999998;
        final double actualResult = Calculator.Add(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_LPIandSNF_When_AddIsCalled_Then_ReturnedDoubleLPF(){
        final double givenInput1 = 999999999;
        final double givenInput2 = -0.0001;

        final double expectedResult = 999999998.9999;
        final double actualResult = Calculator.Add(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_LPIandZERO_When_AddIsCalled_Then_ReturnedDoubleLPI(){
        final double givenInput1 = 999999999;
        final double givenInput2 = 0;

        final double expectedResult = 999999999;
        final double actualResult = Calculator.Add(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_LPIandSPI_When_AddIsCalled_Then_ReturnedDoubleLPI(){
        final double givenInput1 = 999999999;
        final double givenInput2 = 1;

        final double expectedResult = 1000000000;
        final double actualResult = Calculator.Add(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_LPIandSPF_When_AddIsCalled_Then_ReturnedDoubleLPF(){
        final double givenInput1 = 999999999;
        final double givenInput2 = 0.0001;

        final double expectedResult = 999999999.0001;
        final double actualResult = Calculator.Add(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_LPIandLPI_When_AddIsCalled_Then_ReturnedDoubleLPI(){
        final double givenInput1 = 999999999;
        final double givenInput2 = 999999999;

        final double expectedResult = 1999999998;
        final double actualResult = Calculator.Add(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_LPIandLPF_When_AddIsCalled_Then_ReturnedDoubleLPF(){
        final double givenInput1 = 999999999;
        final double givenInput2 = 999999999.9999;

        final double expectedResult = 1999999998.9999;
        final double actualResult = Calculator.Add(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0.000001);
    }

    @Test
    public void Given_LPFandLNF_When_AddIsCalled_Then_ReturnedDoubleZERO(){
        final double givenInput1 = 999999999.9999;
        final double givenInput2 = -999999999.9999;

        final double expectedResult = 0;
        final double actualResult = Calculator.Add(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_LPFandLNI_When_AddIsCalled_Then_ReturnedDoubleSPF(){
        final double givenInput1 = 999999999.9999;
        final double givenInput2 = -999999999;

        final double expectedResult = 0.99989998340607;
        final double actualResult = Calculator.Add(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0.000001);
    }

    @Test
    public void Given_LPFandSNI_When_AddIsCalled_Then_ReturnedDoubleLPF(){
        final double givenInput1 = 999999999.9999;
        final double givenInput2 = -1;

        final double expectedResult = 999999998.9999;
        final double actualResult = Calculator.Add(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_LPFandSNF_When_AddIsCalled_Then_ReturnedDoubleLPF(){
        final double givenInput1 = 999999999.9999;
        final double givenInput2 = -0.0001;

        final double expectedResult = 999999999.9998;
        final double actualResult = Calculator.Add(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_LPFandZERO_When_AddIsCalled_Then_ReturnedDoubleLPF(){
        final double givenInput1 = 999999999.9999;
        final double givenInput2 = 0;

        final double expectedResult = 999999999.9999;
        final double actualResult = Calculator.Add(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_LPFandSPI_When_AddIsCalled_Then_ReturnedDoubleLPF(){
        final double givenInput1 = 999999999.9999;
        final double givenInput2 = 1;

        final double expectedResult = 1000000000.9999;
        final double actualResult = Calculator.Add(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_LPFandSPF_When_AddIsCalled_Then_ReturnedDoubleLPF(){
        final double givenInput1 = 999999999.9999;
        final double givenInput2 = 0.0001;

        final double expectedResult = 1000000000;
        final double actualResult = Calculator.Add(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_LPFandLPI_When_AddIsCalled_Then_ReturnedDoubleLPF(){
        final double givenInput1 = 999999999.9999;
        final double givenInput2 = 999999999;

        final double expectedResult = 1999999998.9999;
        final double actualResult = Calculator.Add(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0.000001);
    }

    @Test
    public void Given_LPFandLPF_When_AddIsCalled_Then_ReturnedDoubleLPF(){
        final double givenInput1 = 999999999.9999;
        final double givenInput2 = 999999999.9999;

        final double expectedResult = 1999999999.9998;
        final double actualResult = Calculator.Add(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    /* ------------------------------------------------------------------------------------------ */

    @Test
    public void Given_LNFandLNF_When_SubtractIsCalled_Then_ReturnedDoubleZERO(){
        final double givenInput1 = -999999999.9999;
        final double givenInput2 = -999999999.9999;

        final double expectedResult = 0;
        final double actualResult = Calculator.Subtract(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_LNFandLNI_When_SubtractIsCalled_Then_ReturnedDoubleSNF(){
        final double givenInput1 = -999999999.9999;
        final double givenInput2 = -999999999;

        final double expectedResult = -0.99989998340607;
        final double actualResult = Calculator.Subtract(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0.000001);
    }

    @Test
    public void Given_LNFandSNI_When_SubtractIsCalled_Then_ReturnedDoubleLNF(){
        final double givenInput1 = -999999999.9999;
        final double givenInput2 = -1;

        final double expectedResult = -999999998.9999;
        final double actualResult = Calculator.Subtract(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_LNFandSNF_When_SubtractIsCalled_Then_ReturnedDoubleLNF(){
        final double givenInput1 = -999999999.9999;
        final double givenInput2 = -0.0001;

        final double expectedResult = -999999999.9998;
        final double actualResult = Calculator.Subtract(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_LNFandZERO_When_SubtractIsCalled_Then_ReturnedDoubleLNF(){
        final double givenInput1 = -999999999.9999;
        final double givenInput2 = 0;

        final double expectedResult = -999999999.9999;
        final double actualResult = Calculator.Subtract(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_LNFandSPI_When_SubtractIsCalled_Then_ReturnedDoubleLNF(){
        final double givenInput1 = -999999999.9999;
        final double givenInput2 = 1;

        final double expectedResult = -1000000000.9999;
        final double actualResult = Calculator.Subtract(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_LNFandSPF_When_SubtractIsCalled_Then_ReturnedDoubleLNF(){
        final double givenInput1 = -999999999.9999;
        final double givenInput2 = 0.0001;

        final double expectedResult = -1000000000;
        final double actualResult = Calculator.Subtract(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_LNFandLPI_When_SubtractIsCalled_Then_ReturnedDoubleLNF(){
        final double givenInput1 = -999999999.9999;
        final double givenInput2 = 999999999;

        final double expectedResult = -1999999998.9999;
        final double actualResult = Calculator.Subtract(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0.000001);
    }

    @Test
    public void Given_LNFandLPF_When_SubtractIsCalled_Then_ReturnedDoubleLNF(){
        final double givenInput1 = -999999999.9999;
        final double givenInput2 = 999999999.9999;

        final double expectedResult = -1999999999.9998;
        final double actualResult = Calculator.Subtract(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_LNIandLNF_When_SubtractIsCalled_Then_ReturnedDoubleSPF(){
        final double givenInput1 = -999999999;
        final double givenInput2 = -999999999.9999;

        final double expectedResult = 0.99989998340607;
        final double actualResult = Calculator.Subtract(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0.000001);
    }

    @Test
    public void Given_LNIandLNI_When_SubtractIsCalled_Then_ReturnedDoubleZERO(){
        final double givenInput1 = -999999999;
        final double givenInput2 = -999999999;

        final double expectedResult = 0;
        final double actualResult = Calculator.Subtract(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_LNIandSNI_When_SubtractIsCalled_Then_ReturnedDoubleLNI(){
        final double givenInput1 = -999999999;
        final double givenInput2 = -1;

        final double expectedResult = -999999998;
        final double actualResult = Calculator.Subtract(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_LNIandSNF_When_SubtractIsCalled_Then_ReturnedDoubleLNF(){
        final double givenInput1 = -999999999;
        final double givenInput2 = -0.0001;

        final double expectedResult = -999999998.9999;
        final double actualResult = Calculator.Subtract(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_LNIandZERO_When_SubtractIsCalled_Then_ReturnedDoubleLNI(){
        final double givenInput1 = -999999999;
        final double givenInput2 = 0;

        final double expectedResult = -999999999;
        final double actualResult = Calculator.Subtract(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_LNIandSPI_When_SubtractIsCalled_Then_ReturnedDoubleLNI(){
        final double givenInput1 = -999999999;
        final double givenInput2 = 1;

        final double expectedResult = -1000000000;
        final double actualResult = Calculator.Subtract(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_LNIandSPF_When_SubtractIsCalled_Then_ReturnedDoubleLNF(){
        final double givenInput1 = -999999999;
        final double givenInput2 = 0.0001;

        final double expectedResult = -999999999.0001;
        final double actualResult = Calculator.Subtract(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_LNIandLPI_When_SubtractIsCalled_Then_ReturnedDoubleLNI(){
        final double givenInput1 = -999999999;
        final double givenInput2 = 999999999;

        final double expectedResult = -1999999998;
        final double actualResult = Calculator.Subtract(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_LNIandLPF_When_SubtractIsCalled_Then_ReturnedDoubleLNF(){
        final double givenInput1 = -999999999;
        final double givenInput2 = 999999999.9999;

        final double expectedResult = -1999999998.9999;
        final double actualResult = Calculator.Subtract(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0.000001);
    }

    @Test
    public void Given_SNIandLNF_When_SubtractIsCalled_Then_ReturnedDoubleLPF(){
        final double givenInput1 = -1;
        final double givenInput2 = -999999999.9999;

        final double expectedResult = 999999998.9999;
        final double actualResult = Calculator.Subtract(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_SNIandLNI_When_SubtractIsCalled_Then_ReturnedDoubleLPI(){
        final double givenInput1 = -1;
        final double givenInput2 = -999999999;

        final double expectedResult = 999999998;
        final double actualResult = Calculator.Subtract(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_SNIandSNI_When_SubtractIsCalled_Then_ReturnedDoubleZERO(){
        final double givenInput1 = -1;
        final double givenInput2 = -1;

        final double expectedResult = 0;
        final double actualResult = Calculator.Subtract(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_SNIandSNF_When_SubtractIsCalled_Then_ReturnedDoubleSNF(){
        final double givenInput1 = -1;
        final double givenInput2 = -0.0001;

        final double expectedResult = -0.9999;
        final double actualResult = Calculator.Subtract(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_SNIandZERO_When_SubtractIsCalled_Then_ReturnedDoubleSNI(){
        final double givenInput1 = -1;
        final double givenInput2 = 0;

        final double expectedResult = -1;
        final double actualResult = Calculator.Subtract(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_SNIandSPI_When_SubtractIsCalled_Then_ReturnedDoubleSNI(){
        final double givenInput1 = -1;
        final double givenInput2 = 1;

        final double expectedResult = -2;
        final double actualResult = Calculator.Subtract(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_SNIandSPF_When_SubtractIsCalled_Then_ReturnedDoubleSNF(){
        final double givenInput1 = -1;
        final double givenInput2 = 0.0001;

        final double expectedResult = -1.0001;
        final double actualResult = Calculator.Subtract(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_SNIandLPI_When_SubtractIsCalled_Then_ReturnedDoubleLNI(){
        final double givenInput1 = -1;
        final double givenInput2 = 999999999;

        final double expectedResult = -1000000000;
        final double actualResult = Calculator.Subtract(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_SNIandLPF_When_SubtractIsCalled_Then_ReturnedDoubleLNF(){
        final double givenInput1 = -1;
        final double givenInput2 = 999999999.9999;

        final double expectedResult = -1000000000.9999;
        final double actualResult = Calculator.Subtract(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_SNFandLNF_When_SubtractIsCalled_Then_ReturnedDoubleLPF(){
        final double givenInput1 = -0.0001;
        final double givenInput2 = -999999999.9999;

        final double expectedResult = 999999999.9998;
        final double actualResult = Calculator.Subtract(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_SNFandLNI_When_SubtractIsCalled_Then_ReturnedDoubleLPF(){
        final double givenInput1 = -0.0001;
        final double givenInput2 = -999999999;

        final double expectedResult = 999999998.9999;
        final double actualResult = Calculator.Subtract(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_SNFandSNI_When_SubtractIsCalled_Then_ReturnedDoubleSPF(){
        final double givenInput1 = -0.0001;
        final double givenInput2 = -1;

        final double expectedResult = 0.9999;
        final double actualResult = Calculator.Subtract(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_SNFandSNF_When_SubtractIsCalled_Then_ReturnedDoubleZERO(){
        final double givenInput1 = -0.0001;
        final double givenInput2 = -0.0001;

        final double expectedResult = 0;
        final double actualResult = Calculator.Subtract(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_SNFandZERO_When_SubtractIsCalled_Then_ReturnedDoubleSNF(){
        final double givenInput1 = -0.0001;
        final double givenInput2 = 0;

        final double expectedResult = -0.0001;
        final double actualResult = Calculator.Subtract(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_SNFandSPI_When_SubtractIsCalled_Then_ReturnedDoubleSNF(){
        final double givenInput1 = -0.0001;
        final double givenInput2 = 1;

        final double expectedResult = -1.0001;
        final double actualResult = Calculator.Subtract(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_SNFandSPF_When_SubtractIsCalled_Then_ReturnedDoubleSNF(){
        final double givenInput1 = -0.0001;
        final double givenInput2 = 0.0001;

        final double expectedResult = -0.0002;
        final double actualResult = Calculator.Subtract(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_SNFandLPI_When_SubtractIsCalled_Then_ReturnedDoubleLNF(){
        final double givenInput1 = -0.0001;
        final double givenInput2 = 999999999;

        final double expectedResult = -999999999.0001;
        final double actualResult = Calculator.Subtract(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_SNFandLPF_When_SubtractIsCalled_Then_ReturnedDoubleLNF(){
        final double givenInput1 = -0.0001;
        final double givenInput2 = 999999999.9999;

        final double expectedResult = -1000000000;
        final double actualResult = Calculator.Subtract(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_ZEROandLNF_When_SubtractIsCalled_Then_ReturnedDoubleLPF(){
        final double givenInput1 = 0;
        final double givenInput2 = -999999999.9999;

        final double expectedResult = 999999999.9999;
        final double actualResult = Calculator.Subtract(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_ZEROandLNI_When_SubtractIsCalled_Then_ReturnedDoubleLPI(){
        final double givenInput1 = 0;
        final double givenInput2 = -999999999;

        final double expectedResult = 999999999;
        final double actualResult = Calculator.Subtract(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_ZEROandSNI_When_SubtractIsCalled_Then_ReturnedDoubleSPI(){
        final double givenInput1 = 0;
        final double givenInput2 = -1;

        final double expectedResult = 1;
        final double actualResult = Calculator.Subtract(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_ZEROandSNF_When_SubtractIsCalled_Then_ReturnedDoubleSPF(){
        final double givenInput1 = 0;
        final double givenInput2 = -0.0001;

        final double expectedResult = 0.0001;
        final double actualResult = Calculator.Subtract(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_ZEROandZERO_When_SubtractIsCalled_Then_ReturnedDoubleZERO(){
        final double givenInput1 = 0;
        final double givenInput2 = 0;

        final double expectedResult = 0;
        final double actualResult = Calculator.Subtract(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_ZEROandSPI_When_SubtractIsCalled_Then_ReturnedDoubleSNI(){
        final double givenInput1 = 0;
        final double givenInput2 = 1;

        final double expectedResult = -1;
        final double actualResult = Calculator.Subtract(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_ZEROandSPF_When_SubtractIsCalled_Then_ReturnedDoubleSNF(){
        final double givenInput1 = 0;
        final double givenInput2 = 0.0001;

        final double expectedResult = -0.0001;
        final double actualResult = Calculator.Subtract(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_ZEROandLPI_When_SubtractIsCalled_Then_ReturnedDoubleLNI(){
        final double givenInput1 = 0;
        final double givenInput2 = 999999999;

        final double expectedResult = -999999999;
        final double actualResult = Calculator.Subtract(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_ZEROandLPF_When_SubtractIsCalled_Then_ReturnedDoubleLNF(){
        final double givenInput1 = 0;
        final double givenInput2 = 999999999.9999;

        final double expectedResult = -999999999.9999;
        final double actualResult = Calculator.Subtract(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_SPIandLNF_When_SubtractIsCalled_Then_ReturnedDoubleLPF(){
        final double givenInput1 = 1;
        final double givenInput2 = -999999999.9999;

        final double expectedResult = 1000000000.9999;
        final double actualResult = Calculator.Subtract(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_SPIandLNI_When_SubtractIsCalled_Then_ReturnedDoubleLPI(){
        final double givenInput1 = 1;
        final double givenInput2 = -999999999;

        final double expectedResult = 1000000000;
        final double actualResult = Calculator.Subtract(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_SPIandSNI_When_SubtractIsCalled_Then_ReturnedDoubleSPI(){
        final double givenInput1 = 1;
        final double givenInput2 = -1;

        final double expectedResult = 2;
        final double actualResult = Calculator.Subtract(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_SPIandSNF_When_SubtractIsCalled_Then_ReturnedDoubleSPF(){
        final double givenInput1 = 1;
        final double givenInput2 = -0.0001;

        final double expectedResult = 1.0001;
        final double actualResult = Calculator.Subtract(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_SPIandZERO_When_SubtractIsCalled_Then_ReturnedDoubleSPI(){
        final double givenInput1 = 1;
        final double givenInput2 = 0;

        final double expectedResult = 1;
        final double actualResult = Calculator.Subtract(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_SPIandSPI_When_SubtractIsCalled_Then_ReturnedDoubleZERO(){
        final double givenInput1 = 1;
        final double givenInput2 = 1;

        final double expectedResult = 0;
        final double actualResult = Calculator.Subtract(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_SPIandSPF_When_SubtractIsCalled_Then_ReturnedDoubleSPF(){
        final double givenInput1 = 1;
        final double givenInput2 = 0.0001;

        final double expectedResult = 0.9999;
        final double actualResult = Calculator.Subtract(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_SPIandLPI_When_SubtractIsCalled_Then_ReturnedDoubleLNI(){
        final double givenInput1 = 1;
        final double givenInput2 = 999999999;

        final double expectedResult = -999999998;
        final double actualResult = Calculator.Subtract(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_SPIandLPF_When_SubtractIsCalled_Then_ReturnedDoubleLNF(){
        final double givenInput1 = 1;
        final double givenInput2 = 999999999.9999;

        final double expectedResult = -999999998.9999;
        final double actualResult = Calculator.Subtract(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_SPFandLNF_When_SubtractIsCalled_Then_ReturnedDoubleLPF(){
        final double givenInput1 = 0.0001;
        final double givenInput2 = -999999999.9999;

        final double expectedResult = 1000000000;
        final double actualResult = Calculator.Subtract(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_SPFandLNI_When_SubtractIsCalled_Then_ReturnedDoubleLPF(){
        final double givenInput1 = 0.0001;
        final double givenInput2 = -999999999;

        final double expectedResult = 999999999.0001;
        final double actualResult = Calculator.Subtract(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_SPFandSNI_When_SubtractIsCalled_Then_ReturnedDoubleSPF(){
        final double givenInput1 = 0.0001;
        final double givenInput2 = -1;

        final double expectedResult = 1.0001;
        final double actualResult = Calculator.Subtract(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_SPFandSNF_When_SubtractIsCalled_Then_ReturnedDoubleSPF(){
        final double givenInput1 = 0.0001;
        final double givenInput2 = -0.0001;

        final double expectedResult = 0.0002;
        final double actualResult = Calculator.Subtract(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_SPFandZERO_When_SubtractIsCalled_Then_ReturnedDoubleSPF(){
        final double givenInput1 = 0.0001;
        final double givenInput2 = 0;

        final double expectedResult = 0.0001;
        final double actualResult = Calculator.Subtract(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_SPFandSPI_When_SubtractIsCalled_Then_ReturnedDoubleSNF(){
        final double givenInput1 = 0.0001;
        final double givenInput2 = 1;

        final double expectedResult = -0.9999;
        final double actualResult = Calculator.Subtract(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_SPFandSPF_When_SubtractIsCalled_Then_ReturnedDoubleZERO(){
        final double givenInput1 = 0.0001;
        final double givenInput2 = 0.0001;

        final double expectedResult = 0;
        final double actualResult = Calculator.Subtract(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_SPFandLPI_When_SubtractIsCalled_Then_ReturnedDoubleLNF(){
        final double givenInput1 = 0.0001;
        final double givenInput2 = 999999999;

        final double expectedResult = -999999998.9999;
        final double actualResult = Calculator.Subtract(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_SPFandLPF_When_SubtractIsCalled_Then_ReturnedDoubleLNF(){
        final double givenInput1 = 0.0001;
        final double givenInput2 = 999999999.9999;

        final double expectedResult = -999999999.9998;
        final double actualResult = Calculator.Subtract(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_LPIandLNF_When_SubtractIsCalled_Then_ReturnedDoubleLPF(){
        final double givenInput1 = 999999999;
        final double givenInput2 = -999999999.9999;

        final double expectedResult = 1999999998.9999;
        final double actualResult = Calculator.Subtract(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0.000001);
    }

    @Test
    public void Given_LPIandLNI_When_SubtractIsCalled_Then_ReturnedDoubleLPI(){
        final double givenInput1 = 999999999;
        final double givenInput2 = -999999999;

        final double expectedResult = 1999999998;
        final double actualResult = Calculator.Subtract(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_LPIandSNI_When_SubtractIsCalled_Then_ReturnedDoubleLPI(){
        final double givenInput1 = 999999999;
        final double givenInput2 = -1;

        final double expectedResult = 1000000000;
        final double actualResult = Calculator.Subtract(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_LPIandSNF_When_SubtractIsCalled_Then_ReturnedDoubleLPF(){
        final double givenInput1 = 999999999;
        final double givenInput2 = -0.0001;

        final double expectedResult = 999999999.0001;
        final double actualResult = Calculator.Subtract(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_LPIandZERO_When_SubtractIsCalled_Then_ReturnedDoubleLPI(){
        final double givenInput1 = 999999999;
        final double givenInput2 = 0;

        final double expectedResult = 999999999;
        final double actualResult = Calculator.Subtract(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_LPIandSPI_When_SubtractIsCalled_Then_ReturnedDoubleLPI(){
        final double givenInput1 = 999999999;
        final double givenInput2 = 1;

        final double expectedResult = 999999998;
        final double actualResult = Calculator.Subtract(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_LPIandSPF_When_SubtractIsCalled_Then_ReturnedDoubleLPF(){
        final double givenInput1 = 999999999;
        final double givenInput2 = 0.0001;

        final double expectedResult = 999999998.9999;
        final double actualResult = Calculator.Subtract(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_LPIandLPI_When_SubtractIsCalled_Then_ReturnedDoubleZERO(){
        final double givenInput1 = 999999999;
        final double givenInput2 = 999999999;

        final double expectedResult = 0;
        final double actualResult = Calculator.Subtract(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_LPIandLPF_When_SubtractIsCalled_Then_ReturnedDoubleSNF(){
        final double givenInput1 = 999999999;
        final double givenInput2 = 999999999.9999;

        final double expectedResult = -0.99989998340607;
        final double actualResult = Calculator.Subtract(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0.000001);
    }

    @Test
    public void Given_LPFandLNF_When_SubtractIsCalled_Then_ReturnedDoubleLPF(){
        final double givenInput1 = 999999999.9999;
        final double givenInput2 = -999999999.9999;

        final double expectedResult = 1999999999.9998;
        final double actualResult = Calculator.Subtract(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_LPFandLNI_When_SubtractIsCalled_Then_ReturnedDoubleLPF(){
        final double givenInput1 = 999999999.9999;
        final double givenInput2 = -999999999;

        final double expectedResult = 1999999998.9999;
        final double actualResult = Calculator.Subtract(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0.000001);
    }

    @Test
    public void Given_LPFandSNI_When_SubtractIsCalled_Then_ReturnedDoubleLPF(){
        final double givenInput1 = 999999999.9999;
        final double givenInput2 = -1;

        final double expectedResult = 1000000000.9999;
        final double actualResult = Calculator.Subtract(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_LPFandSNF_When_SubtractIsCalled_Then_ReturnedDoubleLPF(){
        final double givenInput1 = 999999999.9999;
        final double givenInput2 = -0.0001;

        final double expectedResult = 1000000000;
        final double actualResult = Calculator.Subtract(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_LPFandZERO_When_SubtractIsCalled_Then_ReturnedDoubleLPF(){
        final double givenInput1 = 999999999.9999;
        final double givenInput2 = 0;

        final double expectedResult = 999999999.9999;
        final double actualResult = Calculator.Subtract(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_LPFandSPI_When_SubtractIsCalled_Then_ReturnedDoubleLPF(){
        final double givenInput1 = 999999999.9999;
        final double givenInput2 = 1;

        final double expectedResult = 999999998.9999;
        final double actualResult = Calculator.Subtract(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_LPFandSPF_When_SubtractIsCalled_Then_ReturnedDoubleLPF(){
        final double givenInput1 = 999999999.9999;
        final double givenInput2 = 0.0001;

        final double expectedResult = 999999999.9998;
        final double actualResult = Calculator.Subtract(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_LPFandLPI_When_SubtractIsCalled_Then_ReturnedDoubleSPF(){
        final double givenInput1 = 999999999.9999;
        final double givenInput2 = 999999999;

        final double expectedResult = 0.99989998340607;
        final double actualResult = Calculator.Subtract(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0.000001);
    }

    @Test
    public void Given_LPFandLPF_When_SubtractIsCalled_Then_ReturnedDoubleZERO(){
        final double givenInput1 = 999999999.9999;
        final double givenInput2 = 999999999.9999;

        final double expectedResult = 0;
        final double actualResult = Calculator.Subtract(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    /* ------------------------------------------------------------------------------------------ */

    @Test
    public void Given_LNFandLNF_When_MultiplyIsCalled_Then_ReturnedDoubleLPF(){
        final double givenInput1 = -999999999.9999;
        final double givenInput2 = -999999999.9999;

        final double expectedResult = 9.9999999999979994E17;
        final double actualResult = Calculator.Multiply(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0.000001);
    }

    @Test
    public void Given_LNFandLNI_When_MultiplyIsCalled_Then_ReturnedDoubleLPF(){
        final double givenInput1 = -999999999.9999;
        final double givenInput2 = -999999999;

        final double expectedResult = 9.999999989999E+17;
        final double actualResult = Calculator.Multiply(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_LNFandSNI_When_MultiplyIsCalled_Then_ReturnedDoubleLPF(){
        final double givenInput1 = -999999999.9999;
        final double givenInput2 = -1;

        final double expectedResult = 999999999.9999;
        final double actualResult = Calculator.Multiply(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_LNFandSNF_When_MultiplyIsCalled_Then_ReturnedDoubleLPF(){
        final double givenInput1 = -999999999.9999;
        final double givenInput2 = -0.0001;

        final double expectedResult = 99999.99999999;
        final double actualResult = Calculator.Multiply(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_LNFandZERO_When_MultiplyIsCalled_Then_ReturnedDoubleZERO(){
        final double givenInput1 = -999999999.9999;
        final double givenInput2 = 0;

        final double expectedResult = -0;
        final double actualResult = Calculator.Multiply(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_LNFandSPI_When_MultiplyIsCalled_Then_ReturnedDoubleLNF(){
        final double givenInput1 = -999999999.9999;
        final double givenInput2 = 1;

        final double expectedResult = -999999999.9999;
        final double actualResult = Calculator.Multiply(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_LNFandSPF_When_MultiplyIsCalled_Then_ReturnedDoubleLNF(){
        final double givenInput1 = -999999999.9999;
        final double givenInput2 = 0.0001;

        final double expectedResult = -99999.99999999;
        final double actualResult = Calculator.Multiply(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_LNFandLPI_When_MultiplyIsCalled_Then_ReturnedDoubleLNF(){
        final double givenInput1 = -999999999.9999;
        final double givenInput2 = 999999999;

        final double expectedResult = -9.999999989999E+17;
        final double actualResult = Calculator.Multiply(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_LNFandLPF_When_MultiplyIsCalled_Then_ReturnedDoubleLNF(){
        final double givenInput1 = -999999999.9999;
        final double givenInput2 = 999999999.9999;

        final double expectedResult = -9.9999999999979994E17;
        final double actualResult = Calculator.Multiply(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0.000001);
    }

    @Test
    public void Given_LNIandLNF_When_MultiplyIsCalled_Then_ReturnedDoubleLPF(){
        final double givenInput1 = -999999999;
        final double givenInput2 = -999999999.9999;

        final double expectedResult = 9.999999989999E+17;
        final double actualResult = Calculator.Multiply(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_LNIandLNI_When_MultiplyIsCalled_Then_ReturnedDoubleLPI(){
        final double givenInput1 = -999999999;
        final double givenInput2 = -999999999;

        final double expectedResult = 999999998000000001L;
        final double actualResult = Calculator.Multiply(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_LNIandSNI_When_MultiplyIsCalled_Then_ReturnedDoubleLPI(){
        final double givenInput1 = -999999999;
        final double givenInput2 = -1;

        final double expectedResult = 999999999;
        final double actualResult = Calculator.Multiply(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_LNIandSNF_When_MultiplyIsCalled_Then_ReturnedDoubleLPF(){
        final double givenInput1 = -999999999;
        final double givenInput2 = -0.0001;

        final double expectedResult = 99999.9999;
        final double actualResult = Calculator.Multiply(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0.000001);
    }

    @Test
    public void Given_LNIandZERO_When_MultiplyIsCalled_Then_ReturnedDoubleZERO(){
        final double givenInput1 = -999999999;
        final double givenInput2 = 0;

        final double expectedResult = 0;
        final double actualResult = Calculator.Multiply(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_LNIandSPI_When_MultiplyIsCalled_Then_ReturnedDoubleLNI(){
        final double givenInput1 = -999999999;
        final double givenInput2 = 1;

        final double expectedResult = -999999999;
        final double actualResult = Calculator.Multiply(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_LNIandSPF_When_MultiplyIsCalled_Then_ReturnedDoubleLNF(){
        final double givenInput1 = -999999999;
        final double givenInput2 = 0.0001;

        final double expectedResult = -99999.9999;
        final double actualResult = Calculator.Multiply(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0.000001);
    }

    @Test
    public void Given_LNIandLPI_When_MultiplyIsCalled_Then_ReturnedDoubleLNI(){
        final double givenInput1 = -999999999;
        final double givenInput2 = 999999999;

        final double expectedResult = -999999998000000001L;
        final double actualResult = Calculator.Multiply(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_LNIandLPF_When_MultiplyIsCalled_Then_ReturnedDoubleLNF(){
        final double givenInput1 = -999999999;
        final double givenInput2 = 999999999.9999;

        final double expectedResult = -9.999999989999E+17;
        final double actualResult = Calculator.Multiply(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_SNIandLNF_When_MultiplyIsCalled_Then_ReturnedDoubleLPF(){
        final double givenInput1 = -1;
        final double givenInput2 = -999999999.9999;

        final double expectedResult = 999999999.9999;
        final double actualResult = Calculator.Multiply(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_SNIandLNI_When_MultiplyIsCalled_Then_ReturnedDoubleLPI(){
        final double givenInput1 = -1;
        final double givenInput2 = -999999999;

        final double expectedResult = 999999999;
        final double actualResult = Calculator.Multiply(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_SNIandSNI_When_MultiplyIsCalled_Then_ReturnedDoubleSPI(){
        final double givenInput1 = -1;
        final double givenInput2 = -1;

        final double expectedResult = 1;
        final double actualResult = Calculator.Multiply(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_SNIandSNF_When_MultiplyIsCalled_Then_ReturnedDoubleSPF(){
        final double givenInput1 = -1;
        final double givenInput2 = -0.0001;

        final double expectedResult = 0.0001;
        final double actualResult = Calculator.Multiply(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_SNIandZERO_When_MultiplyIsCalled_Then_ReturnedDoubleZERO(){
        final double givenInput1 = -1;
        final double givenInput2 = 0;

        final double expectedResult = 0;
        final double actualResult = Calculator.Multiply(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_SNIandSPI_When_MultiplyIsCalled_Then_ReturnedDoubleSNI(){
        final double givenInput1 = -1;
        final double givenInput2 = 1;

        final double expectedResult = -1;
        final double actualResult = Calculator.Multiply(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_SNIandSPF_When_MultiplyIsCalled_Then_ReturnedDoubleSNF(){
        final double givenInput1 = -1;
        final double givenInput2 = 0.0001;

        final double expectedResult = -0.0001;
        final double actualResult = Calculator.Multiply(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_SNIandLPI_When_MultiplyIsCalled_Then_ReturnedDoubleLNI(){
        final double givenInput1 = -1;
        final double givenInput2 = 999999999;

        final double expectedResult = -999999999;
        final double actualResult = Calculator.Multiply(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_SNIandLPF_When_MultiplyIsCalled_Then_ReturnedDoubleLNF(){
        final double givenInput1 = -1;
        final double givenInput2 = 999999999.9999;

        final double expectedResult = -999999999.9999;
        final double actualResult = Calculator.Multiply(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_SNFandLNF_When_MultiplyIsCalled_Then_ReturnedDoubleLPF(){
        final double givenInput1 = -0.0001;
        final double givenInput2 = -999999999.9999;

        final double expectedResult = 99999.99999999;
        final double actualResult = Calculator.Multiply(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_SNFandLNI_When_MultiplyIsCalled_Then_ReturnedDoubleLPF(){
        final double givenInput1 = -0.0001;
        final double givenInput2 = -999999999;

        final double expectedResult = 99999.9999;
        final double actualResult = Calculator.Multiply(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0.000001);
    }

    @Test
    public void Given_SNFandSNI_When_MultiplyIsCalled_Then_ReturnedDoubleSPF(){
        final double givenInput1 = -0.0001;
        final double givenInput2 = -1;

        final double expectedResult = 0.0001;
        final double actualResult = Calculator.Multiply(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_SNFandSNF_When_MultiplyIsCalled_Then_ReturnedDoubleSPF(){
        final double givenInput1 = -0.0001;
        final double givenInput2 = -0.0001;

        final double expectedResult = 1.0E-8;
        final double actualResult = Calculator.Multiply(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_SNFandZERO_When_MultiplyIsCalled_Then_ReturnedDoubleZERO(){
        final double givenInput1 = -0.0001;
        final double givenInput2 = 0;

        final double expectedResult = -0;
        final double actualResult = Calculator.Multiply(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_SNFandSPI_When_MultiplyIsCalled_Then_ReturnedDoubleSNF(){
        final double givenInput1 = -0.0001;
        final double givenInput2 = 1;

        final double expectedResult = -0.0001;
        final double actualResult = Calculator.Multiply(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_SNFandSPF_When_MultiplyIsCalled_Then_ReturnedDoubleSNF(){
        final double givenInput1 = -0.0001;
        final double givenInput2 = 0.0001;

        final double expectedResult = -1.0E-8;
        final double actualResult = Calculator.Multiply(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_SNFandLPI_When_MultiplyIsCalled_Then_ReturnedDoubleLNF(){
        final double givenInput1 = -0.0001;
        final double givenInput2 = 999999999;

        final double expectedResult = -99999.9999;
        final double actualResult = Calculator.Multiply(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0.000001);
    }

    @Test
    public void Given_SNFandLPF_When_MultiplyIsCalled_Then_ReturnedDoubleLNF(){
        final double givenInput1 = -0.0001;
        final double givenInput2 = 999999999.9999;

        final double expectedResult = -99999.99999999;
        final double actualResult = Calculator.Multiply(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_ZEROandLNF_When_MultiplyIsCalled_Then_ReturnedDoubleZERO(){
        final double givenInput1 = 0;
        final double givenInput2 = -999999999.9999;

        final double expectedResult = -0;
        final double actualResult = Calculator.Multiply(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_ZEROandLNI_When_MultiplyIsCalled_Then_ReturnedDoubleZERO(){
        final double givenInput1 = 0;
        final double givenInput2 = -999999999;

        final double expectedResult = 0;
        final double actualResult = Calculator.Multiply(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_ZEROandSNI_When_MultiplyIsCalled_Then_ReturnedDoubleZERO(){
        final double givenInput1 = 0;
        final double givenInput2 = -1;

        final double expectedResult = 0;
        final double actualResult = Calculator.Multiply(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_ZEROandSNF_When_MultiplyIsCalled_Then_ReturnedDoubleZERO(){
        final double givenInput1 = 0;
        final double givenInput2 = -0.0001;

        final double expectedResult = -0;
        final double actualResult = Calculator.Multiply(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_ZEROandZERO_When_MultiplyIsCalled_Then_ReturnedDoubleZERO(){
        final double givenInput1 = 0;
        final double givenInput2 = 0;

        final double expectedResult = 0;
        final double actualResult = Calculator.Multiply(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_ZEROandSPI_When_MultiplyIsCalled_Then_ReturnedDoubleZERO(){
        final double givenInput1 = 0;
        final double givenInput2 = 1;

        final double expectedResult = 0;
        final double actualResult = Calculator.Multiply(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_ZEROandSPF_When_MultiplyIsCalled_Then_ReturnedDoubleZERO(){
        final double givenInput1 = 0;
        final double givenInput2 = 0.0001;

        final double expectedResult = 0;
        final double actualResult = Calculator.Multiply(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_ZEROandLPI_When_MultiplyIsCalled_Then_ReturnedDoubleZERO(){
        final double givenInput1 = 0;
        final double givenInput2 = 999999999;

        final double expectedResult = 0;
        final double actualResult = Calculator.Multiply(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_ZEROandLPF_When_MultiplyIsCalled_Then_ReturnedDoubleZERO(){
        final double givenInput1 = 0;
        final double givenInput2 = 999999999.9999;

        final double expectedResult = 0;
        final double actualResult = Calculator.Multiply(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_SPIandLNF_When_MultiplyIsCalled_Then_ReturnedDoubleLNF(){
        final double givenInput1 = 1;
        final double givenInput2 = -999999999.9999;

        final double expectedResult = -999999999.9999;
        final double actualResult = Calculator.Multiply(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_SPIandLNI_When_MultiplyIsCalled_Then_ReturnedDoubleLNI(){
        final double givenInput1 = 1;
        final double givenInput2 = -999999999;

        final double expectedResult = -999999999;
        final double actualResult = Calculator.Multiply(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_SPIandSNI_When_MultiplyIsCalled_Then_ReturnedDoubleSNI(){
        final double givenInput1 = 1;
        final double givenInput2 = -1;

        final double expectedResult = -1;
        final double actualResult = Calculator.Multiply(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_SPIandSNF_When_MultiplyIsCalled_Then_ReturnedDoubleSNF(){
        final double givenInput1 = 1;
        final double givenInput2 = -0.0001;

        final double expectedResult = -0.0001;
        final double actualResult = Calculator.Multiply(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_SPIandZERO_When_MultiplyIsCalled_Then_ReturnedDoubleZERO(){
        final double givenInput1 = 1;
        final double givenInput2 = 0;

        final double expectedResult = 0;
        final double actualResult = Calculator.Multiply(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_SPIandSPI_When_MultiplyIsCalled_Then_ReturnedDoubleSPI(){
        final double givenInput1 = 1;
        final double givenInput2 = 1;

        final double expectedResult = 1;
        final double actualResult = Calculator.Multiply(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_SPIandSPF_When_MultiplyIsCalled_Then_ReturnedDoubleSPF(){
        final double givenInput1 = 1;
        final double givenInput2 = 0.0001;

        final double expectedResult = 0.0001;
        final double actualResult = Calculator.Multiply(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_SPIandLPI_When_MultiplyIsCalled_Then_ReturnedDoubleLPI(){
        final double givenInput1 = 1;
        final double givenInput2 = 999999999;

        final double expectedResult = 999999999;
        final double actualResult = Calculator.Multiply(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_SPIandLPF_When_MultiplyIsCalled_Then_ReturnedDoubleLPF(){
        final double givenInput1 = 1;
        final double givenInput2 = 999999999.9999;

        final double expectedResult = 999999999.9999;
        final double actualResult = Calculator.Multiply(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_SPFandLNF_When_MultiplyIsCalled_Then_ReturnedDoubleLNF(){
        final double givenInput1 = 0.0001;
        final double givenInput2 = -999999999.9999;

        final double expectedResult = -99999.99999999;
        final double actualResult = Calculator.Multiply(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_SPFandLNI_When_MultiplyIsCalled_Then_ReturnedDoubleLNF(){
        final double givenInput1 = 0.0001;
        final double givenInput2 = -999999999;

        final double expectedResult = -99999.9999;
        final double actualResult = Calculator.Multiply(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0.000001);
    }

    @Test
    public void Given_SPFandSNI_When_MultiplyIsCalled_Then_ReturnedDoubleSNF(){
        final double givenInput1 = 0.0001;
        final double givenInput2 = -1;

        final double expectedResult = -0.0001;
        final double actualResult = Calculator.Multiply(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_SPFandSNF_When_MultiplyIsCalled_Then_ReturnedDoubleSNF(){
        final double givenInput1 = 0.0001;
        final double givenInput2 = -0.0001;

        final double expectedResult = -1.0E-8;
        final double actualResult = Calculator.Multiply(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_SPFandZERO_When_MultiplyIsCalled_Then_ReturnedDoubleZERO(){
        final double givenInput1 = 0.0001;
        final double givenInput2 = 0;

        final double expectedResult = 0;
        final double actualResult = Calculator.Multiply(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_SPFandSPI_When_MultiplyIsCalled_Then_ReturnedDoubleSPF(){
        final double givenInput1 = 0.0001;
        final double givenInput2 = 1;

        final double expectedResult = 0.0001;
        final double actualResult = Calculator.Multiply(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_SPFandSPF_When_MultiplyIsCalled_Then_ReturnedDoubleSPF(){
        final double givenInput1 = 0.0001;
        final double givenInput2 = 0.0001;

        final double expectedResult = 1.0E-8;
        final double actualResult = Calculator.Multiply(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_SPFandLPI_When_MultiplyIsCalled_Then_ReturnedDoubleLPF(){
        final double givenInput1 = 0.0001;
        final double givenInput2 = 999999999;

        final double expectedResult = 99999.9999;
        final double actualResult = Calculator.Multiply(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0.000001);
    }

    @Test
    public void Given_SPFandLPF_When_MultiplyIsCalled_Then_ReturnedDoubleLPF(){
        final double givenInput1 = 0.0001;
        final double givenInput2 = 999999999.9999;

        final double expectedResult = 99999.99999999;
        final double actualResult = Calculator.Multiply(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_LPIandLNF_When_MultiplyIsCalled_Then_ReturnedDoubleLNF(){
        final double givenInput1 = 999999999;
        final double givenInput2 = -999999999.9999;

        final double expectedResult = -9.999999989999E+17;
        final double actualResult = Calculator.Multiply(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_LPIandLNI_When_MultiplyIsCalled_Then_ReturnedDoubleLNI(){
        final double givenInput1 = 999999999;
        final double givenInput2 = -999999999;

        final double expectedResult = -999999998000000001L;
        final double actualResult = Calculator.Multiply(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_LPIandSNI_When_MultiplyIsCalled_Then_ReturnedDoubleLNI(){
        final double givenInput1 = 999999999;
        final double givenInput2 = -1;

        final double expectedResult = -999999999;
        final double actualResult = Calculator.Multiply(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_LPIandSNF_When_MultiplyIsCalled_Then_ReturnedDoubleLNF(){
        final double givenInput1 = 999999999;
        final double givenInput2 = -0.0001;

        final double expectedResult = -99999.9999;
        final double actualResult = Calculator.Multiply(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0.000001);
    }

    @Test
    public void Given_LPIandZERO_When_MultiplyIsCalled_Then_ReturnedDoubleZERO(){
        final double givenInput1 = 999999999;
        final double givenInput2 = 0;

        final double expectedResult = 0;
        final double actualResult = Calculator.Multiply(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_LPIandSPI_When_MultiplyIsCalled_Then_ReturnedDoubleLPI(){
        final double givenInput1 = 999999999;
        final double givenInput2 = 1;

        final double expectedResult = 999999999;
        final double actualResult = Calculator.Multiply(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_LPIandSPF_When_MultiplyIsCalled_Then_ReturnedDoubleLPF(){
        final double givenInput1 = 999999999;
        final double givenInput2 = 0.0001;

        final double expectedResult = 99999.9999;
        final double actualResult = Calculator.Multiply(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0.000001);
    }

    @Test
    public void Given_LPIandLPI_When_MultiplyIsCalled_Then_ReturnedDoubleLPI(){
        final double givenInput1 = 999999999;
        final double givenInput2 = 999999999;

        final double expectedResult = 999999998000000001L;
        final double actualResult = Calculator.Multiply(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_LPIandLPF_When_MultiplyIsCalled_Then_ReturnedDoubleLPF(){
        final double givenInput1 = 999999999;
        final double givenInput2 = 999999999.9999;

        final double expectedResult = 9.999999989999E+17;
        final double actualResult = Calculator.Multiply(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_LPFandLNF_When_MultiplyIsCalled_Then_ReturnedDoubleLNF(){
        final double givenInput1 = 999999999.9999;
        final double givenInput2 = -999999999.9999;

        final double expectedResult = -9.9999999999979994E17;
        final double actualResult = Calculator.Multiply(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0.000001);
    }

    @Test
    public void Given_LPFandLNI_When_MultiplyIsCalled_Then_ReturnedDoubleLNF(){
        final double givenInput1 = 999999999.9999;
        final double givenInput2 = -999999999;

        final double expectedResult = -9.999999989999E+17;
        final double actualResult = Calculator.Multiply(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_LPFandSNI_When_MultiplyIsCalled_Then_ReturnedDoubleLNF(){
        final double givenInput1 = 999999999.9999;
        final double givenInput2 = -1;

        final double expectedResult = -999999999.9999;
        final double actualResult = Calculator.Multiply(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_LPFandSNF_When_MultiplyIsCalled_Then_ReturnedDoubleLNF(){
        final double givenInput1 = 999999999.9999;
        final double givenInput2 = -0.0001;

        final double expectedResult = -99999.99999999;
        final double actualResult = Calculator.Multiply(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_LPFandZERO_When_MultiplyIsCalled_Then_ReturnedDoubleZERO(){
        final double givenInput1 = 999999999.9999;
        final double givenInput2 = 0;

        final double expectedResult = 0;
        final double actualResult = Calculator.Multiply(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_LPFandSPI_When_MultiplyIsCalled_Then_ReturnedDoubleLPF(){
        final double givenInput1 = 999999999.9999;
        final double givenInput2 = 1;

        final double expectedResult = 999999999.9999;
        final double actualResult = Calculator.Multiply(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_LPFandSPF_When_MultiplyIsCalled_Then_ReturnedDoubleLPF(){
        final double givenInput1 = 999999999.9999;
        final double givenInput2 = 0.0001;

        final double expectedResult = 99999.99999999;
        final double actualResult = Calculator.Multiply(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_LPFandLPI_When_MultiplyIsCalled_Then_ReturnedDoubleLPF(){
        final double givenInput1 = 999999999.9999;
        final double givenInput2 = 999999999;

        final double expectedResult = 9.999999989999E+17;
        final double actualResult = Calculator.Multiply(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_LPFandLPF_When_MultiplyIsCalled_Then_ReturnedDoubleLPF(){
        final double givenInput1 = 999999999.9999;
        final double givenInput2 = 999999999.9999;

        final double expectedResult = 9.9999999999979994E17;
        final double actualResult = Calculator.Multiply(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0.000001);
    }

    /* ------------------------------------------------------------------------------------------ */

    @Test
    public void Given_LNFandLNF_When_DivideIsCalled_Then_ReturnedDoubleSPF() throws Exception {
        final double givenInput1 = -999999999.9999;
        final double givenInput2 = -999999999.9999;

        final double expectedResult = 1;
        final double actualResult = Calculator.Divide(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_LNFandLNI_When_DivideIsCalled_Then_ReturnedDoubleSPF() throws Exception {
        final double givenInput1 = -999999999.9999;
        final double givenInput2 = -999999999;

        final double expectedResult = 1.0000000009999;
        final double actualResult = Calculator.Divide(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_LNFandSNI_When_DivideIsCalled_Then_ReturnedDoubleLPF() throws Exception {
        final double givenInput1 = -999999999.9999;
        final double givenInput2 = -1;

        final double expectedResult = 999999999.9999;
        final double actualResult = Calculator.Divide(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_LNFandSNF_When_DivideIsCalled_Then_ReturnedDoubleLPF() throws Exception {
        final double givenInput1 = -999999999.9999;
        final double givenInput2 = -0.0001;

        final double expectedResult = 9999999999999L;
        final double actualResult = Calculator.Divide(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test(expected = Exception.class)
    public void Given_LNFandZERO_When_DivideIsCalled_Then_ExceptionIsThrown() throws Exception {
        final double givenInput1 = -999999999.9999;
        final double givenInput2 = 0;
        Calculator.Divide(givenInput1, givenInput2);
    }

    @Test
    public void Given_LNFandSPI_When_DivideIsCalled_Then_ReturnedDoubleLNF() throws Exception {
        final double givenInput1 = -999999999.9999;
        final double givenInput2 = 1;

        final double expectedResult = -999999999.9999;
        final double actualResult = Calculator.Divide(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_LNFandSPF_When_DivideIsCalled_Then_ReturnedDoubleLNF() throws Exception {
        final double givenInput1 = -999999999.9999;
        final double givenInput2 = 0.0001;

        final double expectedResult = -9999999999999L;
        final double actualResult = Calculator.Divide(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_LNFandLPI_When_DivideIsCalled_Then_ReturnedDoubleSNF() throws Exception {
        final double givenInput1 = -999999999.9999;
        final double givenInput2 = 999999999;

        final double expectedResult = -1.0000000009999;
        final double actualResult = Calculator.Divide(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_LNFandLPF_When_DivideIsCalled_Then_ReturnedDoubleSNF() throws Exception {
        final double givenInput1 = -999999999.9999;
        final double givenInput2 = 999999999.9999;

        final double expectedResult = -1;
        final double actualResult = Calculator.Divide(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_LNIandLNF_When_DivideIsCalled_Then_ReturnedDoubleSPF() throws Exception {
        final double givenInput1 = -999999999;
        final double givenInput2 = -999999999.9999;

        final double expectedResult = 0.9999999990001;
        final double actualResult = Calculator.Divide(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0.000001);
    }

    @Test
    public void Given_LNIandLNI_When_DivideIsCalled_Then_ReturnedDoubleSPI() throws Exception {
        final double givenInput1 = -999999999;
        final double givenInput2 = -999999999;

        final double expectedResult = 1;
        final double actualResult = Calculator.Divide(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_LNIandSNI_When_DivideIsCalled_Then_ReturnedDoubleLPI() throws Exception {
        final double givenInput1 = -999999999;
        final double givenInput2 = -1;

        final double expectedResult = 999999999;
        final double actualResult = Calculator.Divide(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_LNIandSNF_When_DivideIsCalled_Then_ReturnedDoubleLPF() throws Exception {
        final double givenInput1 = -999999999;
        final double givenInput2 = -0.0001;

        final double expectedResult = 9999999990000L;
        final double actualResult = Calculator.Divide(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test(expected = Exception.class)
    public void Given_LNIandZERO_When_DivideIsCalled_Then_ExceptionIsThrown() throws Exception {
        final double givenInput1 = -999999999;
        final double givenInput2 = 0;
        Calculator.Divide(givenInput1, givenInput2);
    }

    @Test
    public void Given_LNIandSPI_When_DivideIsCalled_Then_ReturnedDoubleLNI() throws Exception {
        final double givenInput1 = -999999999;
        final double givenInput2 = 1;

        final double expectedResult = -999999999;
        final double actualResult = Calculator.Divide(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_LNIandSPF_When_DivideIsCalled_Then_ReturnedDoubleLNF() throws Exception {
        final double givenInput1 = -999999999;
        final double givenInput2 = 0.0001;

        final double expectedResult = -9999999990000L;
        final double actualResult = Calculator.Divide(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_LNIandLPI_When_DivideIsCalled_Then_ReturnedDoubleSNI() throws Exception {
        final double givenInput1 = -999999999;
        final double givenInput2 = 999999999;

        final double expectedResult = -1;
        final double actualResult = Calculator.Divide(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_LNIandLPF_When_DivideIsCalled_Then_ReturnedDoubleSNF() throws Exception {
        final double givenInput1 = -999999999;
        final double givenInput2 = 999999999.9999;

        final double expectedResult = -0.9999999990001;
        final double actualResult = Calculator.Divide(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0.000001);
    }

    @Test
    public void Given_SNIandLNF_When_DivideIsCalled_Then_ReturnedDoubleSPF() throws Exception {
        final double givenInput1 = -1;
        final double givenInput2 = -999999999.9999;

        final double expectedResult = 1.0000000000001E-9;
        final double actualResult = Calculator.Divide(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_SNIandLNI_When_DivideIsCalled_Then_ReturnedDoubleSPF() throws Exception {
        final double givenInput1 = -1;
        final double givenInput2 = -999999999;

        final double expectedResult = 1.000000001E-9;
        final double actualResult = Calculator.Divide(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_SNIandSNI_When_DivideIsCalled_Then_ReturnedDoubleSPI() throws Exception {
        final double givenInput1 = -1;
        final double givenInput2 = -1;

        final double expectedResult = 1;
        final double actualResult = Calculator.Divide(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_SNIandSNF_When_DivideIsCalled_Then_ReturnedDoubleSPF() throws Exception {
        final double givenInput1 = -1;
        final double givenInput2 = -0.0001;

        final double expectedResult = 10000;
        final double actualResult = Calculator.Divide(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test(expected = Exception.class)
    public void Given_SNIandZERO_When_DivideIsCalled_Then_ExceptionIsThrown() throws Exception {
        final double givenInput1 = -1;
        final double givenInput2 = 0;
        Calculator.Divide(givenInput1, givenInput2);
    }

    @Test
    public void Given_SNIandSPI_When_DivideIsCalled_Then_ReturnedDoubleSNI() throws Exception {
        final double givenInput1 = -1;
        final double givenInput2 = 1;

        final double expectedResult = -1;
        final double actualResult = Calculator.Divide(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_SNIandSPF_When_DivideIsCalled_Then_ReturnedDoubleSNF() throws Exception {
        final double givenInput1 = -1;
        final double givenInput2 = 0.0001;

        final double expectedResult = -10000;
        final double actualResult = Calculator.Divide(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_SNIandLPI_When_DivideIsCalled_Then_ReturnedDoubleSNF() throws Exception {
        final double givenInput1 = -1;
        final double givenInput2 = 999999999;

        final double expectedResult = -1.000000001E-9;
        final double actualResult = Calculator.Divide(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_SNIandLPF_When_DivideIsCalled_Then_ReturnedDoubleSNF() throws Exception {
        final double givenInput1 = -1;
        final double givenInput2 = 999999999.9999;

        final double expectedResult = -1.0000000000001E-9;
        final double actualResult = Calculator.Divide(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_SNFandLNF_When_DivideIsCalled_Then_ReturnedDoubleSPF() throws Exception {
        final double givenInput1 = -0.0001;
        final double givenInput2 = -999999999.9999;

        final double expectedResult = 1.0000000000001E-13;
        final double actualResult = Calculator.Divide(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0.000001);
    }

    @Test
    public void Given_SNFandLNI_When_DivideIsCalled_Then_ReturnedDoubleSPF() throws Exception {
        final double givenInput1 = -0.0001;
        final double givenInput2 = -999999999;

        final double expectedResult = 1.000000001E-13;
        final double actualResult = Calculator.Divide(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_SNFandSNI_When_DivideIsCalled_Then_ReturnedDoubleSPF() throws Exception {
        final double givenInput1 = -0.0001;
        final double givenInput2 = -1;

        final double expectedResult = 0.0001;
        final double actualResult = Calculator.Divide(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_SNFandSNF_When_DivideIsCalled_Then_ReturnedDoubleSPF() throws Exception {
        final double givenInput1 = -0.0001;
        final double givenInput2 = -0.0001;

        final double expectedResult = 1;
        final double actualResult = Calculator.Divide(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test(expected = Exception.class)
    public void Given_SNFandZERO_When_DivideIsCalled_Then_ExceptionIsThrown() throws Exception {
        final double givenInput1 = -0.0001;
        final double givenInput2 = 0;
        Calculator.Divide(givenInput1, givenInput2);
    }

    @Test
    public void Given_SNFandSPI_When_DivideIsCalled_Then_ReturnedDoubleSNF() throws Exception {
        final double givenInput1 = -0.0001;
        final double givenInput2 = 1;

        final double expectedResult = -0.0001;
        final double actualResult = Calculator.Divide(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_SNFandSPF_When_DivideIsCalled_Then_ReturnedDoubleSNF() throws Exception {
        final double givenInput1 = -0.0001;
        final double givenInput2 = 0.0001;

        final double expectedResult = -1;
        final double actualResult = Calculator.Divide(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_SNFandLPI_When_DivideIsCalled_Then_ReturnedDoubleSNF() throws Exception {
        final double givenInput1 = -0.0001;
        final double givenInput2 = 999999999;

        final double expectedResult = -1.000000001E-13;
        final double actualResult = Calculator.Divide(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_SNFandLPF_When_DivideIsCalled_Then_ReturnedDoubleSNF() throws Exception {
        final double givenInput1 = -0.0001;
        final double givenInput2 = 999999999.9999;

        final double expectedResult = -1.0000000000001E-13;
        final double actualResult = Calculator.Divide(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0.000001);
    }

    @Test
    public void Given_ZEROandLNF_When_DivideIsCalled_Then_ReturnedDoubleZERO() throws Exception {
        final double givenInput1 = 0;
        final double givenInput2 = -999999999.9999;

        final double expectedResult = -0;
        final double actualResult = Calculator.Divide(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_ZEROandLNI_When_DivideIsCalled_Then_ReturnedDoubleZERO() throws Exception {
        final double givenInput1 = 0;
        final double givenInput2 = -999999999;

        final double expectedResult = 0;
        final double actualResult = Calculator.Divide(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_ZEROandSNI_When_DivideIsCalled_Then_ReturnedDoubleZERO() throws Exception {
        final double givenInput1 = 0;
        final double givenInput2 = -1;

        final double expectedResult = 0;
        final double actualResult = Calculator.Divide(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_ZEROandSNF_When_DivideIsCalled_Then_ReturnedDoubleZERO() throws Exception {
        final double givenInput1 = 0;
        final double givenInput2 = -0.0001;

        final double expectedResult = -0;
        final double actualResult = Calculator.Divide(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test(expected = Exception.class)
    public void Given_ZEROandZERO_When_DivideIsCalled_Then_ExceptionIsThrown() throws Exception {
        final double givenInput1 = 0;
        final double givenInput2 = 0;
        Calculator.Divide(givenInput1, givenInput2);
    }

    @Test
    public void Given_ZEROandSPI_When_DivideIsCalled_Then_ReturnedDoubleZERO() throws Exception {
        final double givenInput1 = 0;
        final double givenInput2 = 1;

        final double expectedResult = 0;
        final double actualResult = Calculator.Divide(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_ZEROandSPF_When_DivideIsCalled_Then_ReturnedDoubleZERO() throws Exception {
        final double givenInput1 = 0;
        final double givenInput2 = 0.0001;

        final double expectedResult = 0;
        final double actualResult = Calculator.Divide(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_ZEROandLPI_When_DivideIsCalled_Then_ReturnedDoubleZERO() throws Exception {
        final double givenInput1 = 0;
        final double givenInput2 = 999999999;

        final double expectedResult = 0;
        final double actualResult = Calculator.Divide(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_ZEROandLPF_When_DivideIsCalled_Then_ReturnedDoubleZERO() throws Exception {
        final double givenInput1 = 0;
        final double givenInput2 = 999999999.9999;

        final double expectedResult = 0;
        final double actualResult = Calculator.Divide(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_SPIandLNF_When_DivideIsCalled_Then_ReturnedDoubleSNF() throws Exception {
        final double givenInput1 = 1;
        final double givenInput2 = -999999999.9999;

        final double expectedResult = -1.0000000000001E-9;
        final double actualResult = Calculator.Divide(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_SPIandLNI_When_DivideIsCalled_Then_ReturnedDoubleSNF() throws Exception {
        final double givenInput1 = 1;
        final double givenInput2 = -999999999;

        final double expectedResult = -1.000000001E-9;
        final double actualResult = Calculator.Divide(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_SPIandSNI_When_DivideIsCalled_Then_ReturnedDoubleSNI() throws Exception {
        final double givenInput1 = 1;
        final double givenInput2 = -1;

        final double expectedResult = -1;
        final double actualResult = Calculator.Divide(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_SPIandSNF_When_DivideIsCalled_Then_ReturnedDoubleSNF() throws Exception {
        final double givenInput1 = 1;
        final double givenInput2 = -0.0001;

        final double expectedResult = -10000;
        final double actualResult = Calculator.Divide(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test(expected = Exception.class)
    public void Given_SPIandZERO_When_DivideIsCalled_Then_ExceptionIsThrown() throws Exception {
        final double givenInput1 = 1;
        final double givenInput2 = 0;
        Calculator.Divide(givenInput1, givenInput2);
    }

    @Test
    public void Given_SPIandSPI_When_DivideIsCalled_Then_ReturnedDoubleSPI() throws Exception {
        final double givenInput1 = 1;
        final double givenInput2 = 1;

        final double expectedResult = 1;
        final double actualResult = Calculator.Divide(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_SPIandSPF_When_DivideIsCalled_Then_ReturnedDoubleSPF() throws Exception {
        final double givenInput1 = 1;
        final double givenInput2 = 0.0001;

        final double expectedResult = 10000;
        final double actualResult = Calculator.Divide(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_SPIandLPI_When_DivideIsCalled_Then_ReturnedDoubleSPF() throws Exception {
        final double givenInput1 = 1;
        final double givenInput2 = 999999999;

        final double expectedResult = 1.000000001E-9;
        final double actualResult = Calculator.Divide(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_SPIandLPF_When_DivideIsCalled_Then_ReturnedDoubleSPF() throws Exception {
        final double givenInput1 = 1;
        final double givenInput2 = 999999999.9999;

        final double expectedResult = 1.0000000000001E-9;
        final double actualResult = Calculator.Divide(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_SPFandLNF_When_DivideIsCalled_Then_ReturnedDoubleSNF() throws Exception {
        final double givenInput1 = 0.0001;
        final double givenInput2 = -999999999.9999;

        final double expectedResult = -1.0000000000001E-13;
        final double actualResult = Calculator.Divide(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0.000001);
    }

    @Test
    public void Given_SPFandLNI_When_DivideIsCalled_Then_ReturnedDoubleSNF() throws Exception {
        final double givenInput1 = 0.0001;
        final double givenInput2 = -999999999;

        final double expectedResult = -1.000000001E-13;
        final double actualResult = Calculator.Divide(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_SPFandSNI_When_DivideIsCalled_Then_ReturnedDoubleSNF() throws Exception {
        final double givenInput1 = 0.0001;
        final double givenInput2 = -1;

        final double expectedResult = -0.0001;
        final double actualResult = Calculator.Divide(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_SPFandSNF_When_DivideIsCalled_Then_ReturnedDoubleSNF() throws Exception {
        final double givenInput1 = 0.0001;
        final double givenInput2 = -0.0001;

        final double expectedResult = -1;
        final double actualResult = Calculator.Divide(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test(expected = Exception.class)
    public void Given_SPFandZERO_When_DivideIsCalled_Then_ExceptionIsThrown() throws Exception {
        final double givenInput1 = 0.0001;
        final double givenInput2 = 0;
        Calculator.Divide(givenInput1, givenInput2);
    }

    @Test
    public void Given_SPFandSPI_When_DivideIsCalled_Then_ReturnedDoubleSPF() throws Exception {
        final double givenInput1 = 0.0001;
        final double givenInput2 = 1;

        final double expectedResult = 0.0001;
        final double actualResult = Calculator.Divide(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_SPFandSPF_When_DivideIsCalled_Then_ReturnedDoubleSPF() throws Exception {
        final double givenInput1 = 0.0001;
        final double givenInput2 = 0.0001;

        final double expectedResult = 1;
        final double actualResult = Calculator.Divide(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_SPFandLPI_When_DivideIsCalled_Then_ReturnedDoubleSPF() throws Exception {
        final double givenInput1 = 0.0001;
        final double givenInput2 = 999999999;

        final double expectedResult = 1.000000001E-13;
        final double actualResult = Calculator.Divide(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_SPFandLPF_When_DivideIsCalled_Then_ReturnedDoubleSPF() throws Exception {
        final double givenInput1 = 0.0001;
        final double givenInput2 = 999999999.9999;

        final double expectedResult = 1.0000000000001E-13;
        final double actualResult = Calculator.Divide(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0.000001);
    }

    @Test
    public void Given_LPIandLNF_When_DivideIsCalled_Then_ReturnedDoubleSNF() throws Exception {
        final double givenInput1 = 999999999;
        final double givenInput2 = -999999999.9999;

        final double expectedResult = -0.9999999990001;
        final double actualResult = Calculator.Divide(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0.000001);
    }

    @Test
    public void Given_LPIandLNI_When_DivideIsCalled_Then_ReturnedDoubleSNI() throws Exception {
        final double givenInput1 = 999999999;
        final double givenInput2 = -999999999;

        final double expectedResult = -1;
        final double actualResult = Calculator.Divide(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_LPIandSNI_When_DivideIsCalled_Then_ReturnedDoubleLNI() throws Exception {
        final double givenInput1 = 999999999;
        final double givenInput2 = -1;

        final double expectedResult = -999999999;
        final double actualResult = Calculator.Divide(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_LPIandSNF_When_DivideIsCalled_Then_ReturnedDoubleLNF() throws Exception {
        final double givenInput1 = 999999999;
        final double givenInput2 = -0.0001;

        final double expectedResult = -9999999990000L;
        final double actualResult = Calculator.Divide(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test(expected = Exception.class)
    public void Given_LPIandZERO_When_DivideIsCalled_Then_ExceptionIsThrown() throws Exception {
        final double givenInput1 = 999999999;
        final double givenInput2 = 0;
        Calculator.Divide(givenInput1, givenInput2);
    }

    @Test
    public void Given_LPIandSPI_When_DivideIsCalled_Then_ReturnedDoubleLPI() throws Exception {
        final double givenInput1 = 999999999;
        final double givenInput2 = 1;

        final double expectedResult = 999999999;
        final double actualResult = Calculator.Divide(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_LPIandSPF_When_DivideIsCalled_Then_ReturnedDoubleLPF() throws Exception {
        final double givenInput1 = 999999999;
        final double givenInput2 = 0.0001;

        final double expectedResult = 9999999990000L;
        final double actualResult = Calculator.Divide(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_LPIandLPI_When_DivideIsCalled_Then_ReturnedDoubleSPI() throws Exception {
        final double givenInput1 = 999999999;
        final double givenInput2 = 999999999;

        final double expectedResult = 1;
        final double actualResult = Calculator.Divide(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_LPIandLPF_When_DivideIsCalled_Then_ReturnedDoubleSPF() throws Exception {
        final double givenInput1 = 999999999;
        final double givenInput2 = 999999999.9999;

        final double expectedResult = 0.9999999990001;
        final double actualResult = Calculator.Divide(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0.000001);
    }

    @Test
    public void Given_LPFandLNF_When_DivideIsCalled_Then_ReturnedDoubleSNF() throws Exception {
        final double givenInput1 = 999999999.9999;
        final double givenInput2 = -999999999.9999;

        final double expectedResult = -1;
        final double actualResult = Calculator.Divide(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_LPFandLNI_When_DivideIsCalled_Then_ReturnedDoubleSNF() throws Exception {
        final double givenInput1 = 999999999.9999;
        final double givenInput2 = -999999999;

        final double expectedResult = -1.0000000009999;
        final double actualResult = Calculator.Divide(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_LPFandSNI_When_DivideIsCalled_Then_ReturnedDoubleLNF() throws Exception {
        final double givenInput1 = 999999999.9999;
        final double givenInput2 = -1;

        final double expectedResult = -999999999.9999;
        final double actualResult = Calculator.Divide(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_LPFandSNF_When_DivideIsCalled_Then_ReturnedDoubleLNF() throws Exception {
        final double givenInput1 = 999999999.9999;
        final double givenInput2 = -0.0001;

        final double expectedResult = -9999999999999L;
        final double actualResult = Calculator.Divide(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test(expected = Exception.class)
    public void Given_LPFandZERO_When_DivideIsCalled_Then_ExceptionIsThrown() throws Exception {
        final double givenInput1 = 999999999.9999;
        final double givenInput2 = 0;
        Calculator.Divide(givenInput1, givenInput2);
    }

    @Test
    public void Given_LPFandSPI_When_DivideIsCalled_Then_ReturnedDoubleLPF() throws Exception {
        final double givenInput1 = 999999999.9999;
        final double givenInput2 = 1;

        final double expectedResult = 999999999.9999;
        final double actualResult = Calculator.Divide(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_LPFandSPF_When_DivideIsCalled_Then_ReturnedDoubleLPF() throws Exception {
        final double givenInput1 = 999999999.9999;
        final double givenInput2 = 0.0001;

        final double expectedResult = 9999999999999L;
        final double actualResult = Calculator.Divide(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_LPFandLPI_When_DivideIsCalled_Then_ReturnedDoubleSPF() throws Exception {
        final double givenInput1 = 999999999.9999;
        final double givenInput2 = 999999999;

        final double expectedResult = 1.0000000009999;
        final double actualResult = Calculator.Divide(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_LPFandLPF_When_DivideIsCalled_Then_ReturnedDoubleSPF() throws Exception {
        final double givenInput1 = 999999999.9999;
        final double givenInput2 = 999999999.9999;

        final double expectedResult = 1;
        final double actualResult = Calculator.Divide(givenInput1, givenInput2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test(expected = Exception.class)
    public void Given_NegativeNumber_When_SqrtIsCalled_Then_ExceptionIsThrown() throws Exception {
        final double givenInput = -1;
        Calculator.Sqrt(givenInput);
    }

    @Test
    public void Given_Zero_When_SqrtIsCalled_Then_ReturnedDoubleZero() throws Exception {
        final double givenInput = 0;

        final double expectedResult = 0;
        final double actualResult = Calculator.Sqrt(givenInput);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_PerfectSquare_When_SqrtIsCalled_Then_ReturnedPerfectDouble() throws Exception {
        final double givenInput = 25;

        final double expectedResult = 5;
        final double actualResult = Calculator.Sqrt(givenInput);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_ApproximatePI_When_SqrtIsCalled_Then_ReturnedDouble() throws Exception {
        final double givenInput = 3.14;

        final double expectedResult = 1.772004514666935;
        final double actualResult = Calculator.Sqrt(givenInput);

        assertEquals(expectedResult, actualResult, 0.000001);
    }

    @Test
    public void Given_NegativeNumber_When_ReverseSignIsCalled_Then_ReturnedThePositiveDouble(){
        final double givenInput = -1;

        final double expectedResult = 1;
        final double actualResult = Calculator.ReverseSign(givenInput);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_Zero_When_ReverseSignIsCalled_Then_ReturnedZero(){
        final double givenInput = 0;

        final double expectedResult = 0;
        final double actualResult = Calculator.ReverseSign(givenInput);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_PositiveNumber_When_ReverseSignIsCalled_Then_ReturnedTheNegativeDouble(){
        final double givenInput = 1;

        final double expectedResult = -1;
        final double actualResult = Calculator.ReverseSign(givenInput);

        assertEquals(expectedResult, actualResult, 0);
    }


}