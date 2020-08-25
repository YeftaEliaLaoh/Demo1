package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "user")
public class User
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    String phone;
    String firstName;
    String lastName;
    String datetimepicker2;
    String datetimepicker3;
    String datetimepicker1;
    String inlineRadio1;
    String inlineRadio2;
    @Column(unique = true)
    String email;

    public Long getId()
    {
        return id;
    }

    public void setId( Long id )
    {
        this.id = id;
    }

    public String getPhone()
    {
        return phone;
    }

    public void setPhone( String phone )
    {
        this.phone = phone;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName( String firstName )
    {
        this.firstName = firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName( String lastName )
    {
        this.lastName = lastName;
    }

    public String getDatetimepicker2()
    {
        return datetimepicker2;
    }

    public void setDatetimepicker2( String datetimepicker2 )
    {
        this.datetimepicker2 = datetimepicker2;
    }

    public String getDatetimepicker3()
    {
        return datetimepicker3;
    }

    public void setDatetimepicker3( String datetimepicker3 )
    {
        this.datetimepicker3 = datetimepicker3;
    }

    public String getDatetimepicker1()
    {
        return datetimepicker1;
    }

    public void setDatetimepicker1( String datetimepicker1 )
    {
        this.datetimepicker1 = datetimepicker1;
    }

    public String getInlineRadio1()
    {
        return inlineRadio1;
    }

    public void setInlineRadio1( String inlineRadio1 )
    {
        this.inlineRadio1 = inlineRadio1;
    }

    public String getInlineRadio2()
    {
        return inlineRadio2;
    }

    public void setInlineRadio2( String inlineRadio2 )
    {
        this.inlineRadio2 = inlineRadio2;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail( String email )
    {
        this.email = email;
    }
}
