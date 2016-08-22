package ahpra

import geb.Browser
import geb.Configuration

import static org.junit.Assert.*
import org.junit.*

class AddTwoNamesTests {

    @Before
    void setUp() {
    }

    @After
    void tearDown() {
    }
//this is the update
    @Test
    void normalName() {
        Browser.drive {
            to PhysioListPage
            at PhysioListPage
            newPhysioButton.click()
            at CreatePhysioPage
            nameField.click()
            nameField.value("Kim Smith")
            anotherNameField.click()
            anotherNameField.value("Khalid Ali")
            createButton.click()
            at ShowPhysioPage
            assert physioCreatedMessage.text().contains("created")
            to PhysioListPage
        }
    }

    @Test
    void normalNameAndAge() {
        Browser.drive {
            to PhysioListPage
            at PhysioListPage
            newPhysioButton.click()
            at CreatePhysioPage
            nameField.click()
            nameField.value("Kim Smith")
            ageField.click()
            ageField.value(15)
            createButton.click()
            at ShowPhysioPage
            assert physioCreatedMessage.text().contains("created")
            to PhysioListPage
        }
    }
}
