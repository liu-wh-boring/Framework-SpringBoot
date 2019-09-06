package com.chapter10.mongodb;

import org.springframework.data.mongodb.core.index.Indexed;

import java.util.Date;
import java.util.Random;

public class Energy
{
    @Indexed
    private final Date date;
    private final long meter;
    private final String datatype;
    private final double value;

    public Energy(Date date, long meter, String datatype)
    {
        this.date = date;
        this.meter = meter;
        this.datatype = datatype;
        this.value = new Random().nextDouble();
    }

    public Date getDate()
    {
        return date;
    }

    public long getMeter()
    {
        return meter;
    }

    public String getDatatype()
    {
        return datatype;
    }

    public double getValue()
    {
        return value;
    }
}
