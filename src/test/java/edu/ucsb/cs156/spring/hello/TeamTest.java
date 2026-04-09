package edu.ucsb.cs156.spring.hello;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TeamTest {

    Team team;

    @BeforeEach
    public void setup() {
        team = new Team("test-team");    
    }

    @Test
    public void getName_returns_correct_name() {
       assert(team.getName().equals("test-team"));
    }

   
    @Test
    public void toString_returns_correct_string() {
        assertEquals("Team(name=test-team, members=[])", team.toString());
    }

        @Test
    public void testEqualsSameObject() {
        Team t1 = new Team();
        t1.setName("foo");
        t1.addMember("bar");

        assertTrue(t1.equals(t1));
    }

    @Test
    public void testEqualsDifferentClass() {
        Team t1 = new Team();
        t1.setName("foo");
        t1.addMember("bar");

        assertFalse(t1.equals("not a team"));
    }

    @Test
    public void testEqualsSameNameSameMembers() {
        Team t1 = new Team();
        t1.setName("foo");
        t1.addMember("bar");

        Team t2 = new Team();
        t2.setName("foo");
        t2.addMember("bar");

        assertTrue(t1.equals(t2));
    }

    @Test
    public void testEqualsSameNameDifferentMembers() {
        Team t1 = new Team();
        t1.setName("foo");
        t1.addMember("bar");

        Team t2 = new Team();
        t2.setName("foo");
        t2.addMember("qux");

        assertFalse(t1.equals(t2));
    }

    @Test
    public void testEqualsDifferentNameSameMembers() {
        Team t1 = new Team();
        t1.setName("foo");
        t1.addMember("bar");

        Team t2 = new Team();
        t2.setName("baz");
        t2.addMember("bar");

        assertFalse(t1.equals(t2));
    }
    
    @Test
        public void testEqualsDifferentNameDifferentMembers() {
        Team t1 = new Team();
        t1.setName("foo");
        t1.addMember("bar");

        Team t2 = new Team();
        t2.setName("baz");
        t2.addMember("qux");

        assertFalse(t1.equals(t2));
    }

    @Test
    public void testEqualsNull() {
        Team t1 = new Team();
        t1.addMember("A");
        t1.addMember("B");

        assertFalse(t1.equals(null));
    }

    @Test
    public void testHashCode() {
        Team t1 = new Team();
        t1.setName("foo");
        t1.addMember("bar");
        Team t2 = new Team();
        t2.setName("foo");
        t2.addMember("bar");
        assertEquals(t1.hashCode(), t2.hashCode());
    }

}
