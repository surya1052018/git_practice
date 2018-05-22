@Config annotation
------------------
A class with @Config annotation is used to perform an action on button click. In most cases, the action is to retrieve values via HTTP Rest calls from database (MongoDB), and display on the web page.

Example:

Config.java

@Config(url="/pageAddEditGoal/tileEditGoal/sectionEditGoal/goalDetailsForm/_nav?pageId=pageCarePlanSummary")
@Button(type = Button.Type.PLAIN)
private String cancel;


In the example shown above, when the button is clicked, the control will be navigated to the specified url.
nav is the http call for navigation.


The possible Actions are: -

get for HTTP GET
new for HTTP post
update for HTTP update
delete for HTTP delete
search for searching
nav for navigation
process for custom process/ work-flow definitions


@Configs 
----------
@Configs is a collection of configuration calls. Multiple calls to the database can be made simultaneously using @Configs, where each call will be represented by @Config.

Example:

@Configs({
@Config(url="~/client/org_name/_update"),
@Config(url="~/client/org_name/_process?fn=_set&amp;url=/p/cmcase/_search?fn=query&amp;where=cmcase.patientReferred.firstName.eq('<!/.m/patientReferred/firstName!>').and(cmcase.patientReferred.lastName.eq('<!/.m/patientReferred/lastName!>'))"),
@Config(url="~/client/org_name/_nav?pageId=vpAdvancedCaseSearch")
        })
@Button(type=Button.Type.PRIMARY, formReset=false)
private String submit;



As shown in the example, when the submit button is clicked, three http calls that are being made viz. update, process, and navigation





