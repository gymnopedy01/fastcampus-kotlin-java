package com.fastcampus.kotlinjava.keyword;

import java.io.InputStream;

enum CountryCodeJava {
    kr, jp, us;
}

public class JavaKeyword {
    private InputStream in;
    private Boolean is;

    public InputStream getIn() {
        return in;
    }

    public void setIn(InputStream in) {
        this.in = in;
    }

    public Boolean getIs() {
        return is;
    }

    public void setIs(Boolean is) {
        this.is = is;
    }

}