package ahpra

import geb.Page

/**
 * Created by Mohammad on 5/01/2016.
 */
class ShowPhysioPage extends Page {

    static url = "/physio/show"
    static at = { title == "Show Physio" }

    static content = {
        physioCreatedMessage {$('#show-physio > div')}
    }

}
