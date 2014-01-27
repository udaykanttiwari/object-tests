package udaykant.objecttest;

import junit.framework.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


    public class ComparatorTests extends Person {
        private List<Person> people;

        public ComparatorTests(String name, int age) {
            super(name, age);
        }

        public static List addPeopleToList(Person... persons) {
            List<Person> people = new ArrayList<Person>();
            for (Person person : persons) {
                people.add(person);
            }
            return people;
        }

        @Before
        public void setUp() throws Exception {
            Person swamiji = new Person("Swamiji", 3);
            Person kunal = new Person("Kunal", 50);
            Person digvijay = new Person("Digvijay", 35);
            people = addPeopleToList(digvijay, kunal, swamiji);
        }

        @Test
        public void test_comparator_which_compares_person_by_name() throws Exception {
            Comparator compareName = new Comparator<Person>() {
                @Override
                public int compare(Person p1, Person p2) {
                    return p1.getName().compareTo(p2.getName());
                }
            };

            Collections.sort(people, compareName);

            Assert.assertEquals("Digvijay", people.get(0).getName());
            Assert.assertEquals("Kunal", people.get(1).getName());
            Assert.assertEquals("Swamiji", people.get(2).getName());
        }

        @Test
        public void test_comparator_which_compares_person_by_name_length() throws Exception {
            Comparator compareNameLength = new Comparator<Person>() {
                @Override
                public int compare(Person p1, Person p2) {
                    return p1.getName().length() - p2.getName().length();
                }
            };

            Collections.sort(people, compareNameLength);

            Assert.assertEquals("Kunal", people.get(0).getName());
            Assert.assertEquals("Swamiji", people.get(1).getName());
            Assert.assertEquals("Digvijay", people.get(2).getName());
        }

        @Test
        public void test_comparator_which_compares_person_by_age() throws Exception {
            Comparator compareAge = new Comparator<Person>() {
                @Override
                public int compare(Person p1, Person p2) {
                    return p1.getAge() - p2.getAge();
                }
            };

            Collections.sort(people, compareAge);

            Assert.assertEquals("Swamiji", people.get(0).getName());
            Assert.assertEquals("Digvijay", people.get(1).getName());
            Assert.assertEquals("Kunal", people.get(2).getName());
        }

        @Test
        public void test_comparator_which_compares_person_by_age_descending() throws Exception {
            Comparator compareAgeDescending = new Comparator<Person>() {
                @Override
                public int compare(Person p1, Person p2) {
                    return p2.getAge() - p1.getAge();
                }
            };

            Collections.sort(people, compareAgeDescending);

            Assert.assertEquals("Kunal", people.get(0).getName());
            Assert.assertEquals("Digvijay", people.get(1).getName());
            Assert.assertEquals("Swamiji", people.get(2).getName());
        }

    }


