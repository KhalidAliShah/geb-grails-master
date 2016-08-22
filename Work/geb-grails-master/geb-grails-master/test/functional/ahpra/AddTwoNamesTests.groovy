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
//this is the update of the update
    @Test
    void TwoNameTest() {
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

}
