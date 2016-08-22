package ahpra

import geb.Browser
import geb.Configuration

import static org.junit.Assert.*
import org.junit.*

class AhpraTests {

    @Before
    void setUp() {
    }

    @After
    void tearDown() {
    }

    @Test
    void testLoadOfAhpraHomePage() {
        Browser.drive {
            to PhysioListPage
            at PhysioListPage
            newPhysioButton.click()
            at CreatePhysioPage
            nameField.click()
            nameField.value("Kim Smith")
            createButton.click()
            at ShowPhysioPage
            assert physioCreatedMessage.text().contains("created")
            to PhysioListPage
        }


    }

    @Test
    void normalName() {
        Browser.drive {
            to PhysioListPage
            at PhysioListPage
            newPhysioButton.click()
            at CreatePhysioPage
            nameField.click()
            nameField.value("Kim Smith")
            createButton.click()
            at ShowPhysioPage
            assert physioCreatedMessage.text().contains("created")
            to PhysioListPage
        }
    }





}
