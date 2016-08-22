package ahpra

import geb.Page

/**
 * Created by Mohammad on 5/01/2016.
 */
class CreatePhysioPage extends Page {

    static url = "/physio/create"
    static at = { title == "Create Physio" }

    static content = {
        nameField { $('#name') }
        createButton { $('#create') }
    }

}
