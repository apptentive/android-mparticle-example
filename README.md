# Android Example App for Apptentive + mParticle

This app demonstrates how Apptentive's mParticle Kit can be used to add Apptentive features to your app using mParticle.

# Setting up the app

1. In `ExampleApplication.java`, supply your mParticle *API Key* and *API Secret*
2. [Create an Apptentive account](https://be.apptentive.com/register/sign_up), and add your first Android app.
3. Go to the [mParticle providers list](https://app.mparticle.com/providers), and select _*Apptentive*_.
4. Click _*Activate a Platform*_, and turn on Android.
5. Enter your Apptentive API Key, which you can find [here](https://be.apptentive.com/apps/current/settings/api), and click _*Save*_.

# Configuring Interactions

This example app logs events to mParticle when you click any of its buttons. When these actions are logged to mParticle, they are passed through to the Apptentive SDK. You can configure Apptentive to display Interactions at any of these events.

## Showing a Survey
Here is how to set up an Apptentive survey to display when you click the _*Tools*_ navigation item from the hamburger menu in this app.

1. Log into the Apptentive Dashboard and click [create a new survey](https://be.apptentive.com/apps/current/surveys).
2. Give it a name, title, and description. Add one or several questions. Click _*Save*_.
3. Under _Survey Targeting_, select _Publish survey as an independent Interaction_.
4. In the _Where_ section, click _*Create New Event…*_.
5. Type `nav_manage` and save the event.  
6. Note: If you have previously sent this event, you can select it without adding it above.
7. Select _Allow multiple responses from the same person_ so you can test display the survey as often as you like.
8. Click _*Save & Continue*_
9. Click _*Launch Survey*_

You can now display the survey by launching this app and clicking the _*Hamburger Menu -> Tools*_ item.


## Example Events

This table shows all the events that this example app currently logs to mParticle.

| *Event Name*    | *Description*                  |
| :-------------- | :----------------------------- |
| action_settings | ActionBar Overflow: Settings   |
| fab_clicked     | Floating Action Button         |
| nav_camera      | Navigation: Import             |
| nav_gallery     | Navigation: Gallery            |
| nav_slideshow   | Navigation: Slideshow          |
| nav_manage      | Navigation: Tools              |
| nav_share       | Navigation: Share              |
| nav_send        | Navigation: Send Feedback      |
