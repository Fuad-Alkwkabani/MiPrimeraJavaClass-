package javaprimerclass.person;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PersonTest {
    @Test
    void testPersonAttributes() {
        Person person = new Person("Fuad", "Al kwkabani", "11223344", 1994, "Yemen", 'H');

        
        assertEquals("Fuad", person.getFirstName());
        assertEquals("Al kwkabani", person.getLastName());
        assertEquals("11223344", person.getIdNumber());
        assertEquals(1994, person.getBirthYear());
        assertEquals("Yemen", person.getBirthCountry());
        assertEquals('H', person.getGender());

    }

    
}
