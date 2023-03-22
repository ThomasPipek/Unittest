import static org.junit.jupiter.api.Assertions.*;

// Testclass

class ContainerTest {

    private Container m_container;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        m_container = new Container(3);
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @org.junit.jupiter.api.Test
    void getSize() {
        assertEquals(3, m_container.getSize());
    }

    @org.junit.jupiter.api.Test
    void add() {
        assertEquals(true, m_container.add(1));
        assertEquals(true, m_container.add(2));
        assertEquals(true, m_container.add(3));
        assertEquals(false, m_container.add(4));
    }
}