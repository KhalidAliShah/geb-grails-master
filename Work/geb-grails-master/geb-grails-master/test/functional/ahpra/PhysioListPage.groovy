package ahpra

import geb.Module
import geb.Page

class PhysioListPage extends Page {

        static url = "physio/list"
        static at = { title == "Physio List" }

        static content = {
            newPhysioButton { $('body > div.nav > ul > li:nth-child(2) > a') }
            physioList { moduleList(PhysioRow, $('#list-artist > table > tbody > tr')) }
        }

}

class PhysioRow extends Module {
    static content = {
        genre { $('td:nth-child(1) > a') }
        artist { $('td:nth-child(2)') }
    }
}