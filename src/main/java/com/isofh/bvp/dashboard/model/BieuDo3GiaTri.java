package com.isofh.bvp.dashboard.model;

import java.math.BigDecimal;
import java.util.List;

public class BieuDo3GiaTri {
    private List<String> names;
    private List<BigDecimal> values1;
    private List<BigDecimal> values2;
    private List<BigDecimal> values3;

    public List<String> getNames() {
        return names;
    }

    public void setNames(List<String> names) {
        this.names = names;
    }

    public List<BigDecimal> getValues1() {
        return values1;
    }

    public void setValues1(List<BigDecimal> values1) {
        this.values1 = values1;
    }

    public List<BigDecimal> getValues2() {
        return values2;
    }

    public void setValues2(List<BigDecimal> values2) {
        this.values2 = values2;
    }

    public List<BigDecimal> getValues3() {
        return values3;
    }

    public void setValues3(List<BigDecimal> values3) {
        this.values3 = values3;
    }
}
