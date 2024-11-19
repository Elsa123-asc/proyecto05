packages.santander.ascender.proyecto05;

public class PerroTest {
    @Test
        void testComer() {
        Perro perro = new Perro(45.5);

        perro.comer(34.2);

        assertEquals(79.7, perro.getPeso(), 0.000001);
    }
}
