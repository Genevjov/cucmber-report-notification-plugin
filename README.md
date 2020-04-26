# cucmber-report-notification-plugin
Report notification plugin for Cucumber framework

Property structure for reporting:

```yaml
 reportData:
    notificationType: "HTML"
    reportFileType: "changeme"
    reportFilePath: "changeme"
slack:
  webHook: "changeme"
email:
  receivers:
    - "changeme@changeme.com"
    - "changeme@changeme.com"
  sendFrom: "changeme@changeme.com"
  subject: "test-report"
  smtpMailProperties:
    smtpHost: "changeme.com"
    smtpPort: "changeme"
    login: "changeme@gmail.com"
    password: "changeme"
```
| Property name | Meaning  |
| ------------ | ------------ |
|  reportData | Storage for notification notificationType, Cucumber report notificationType, path to report |
|  reportData.notificationType | Notification content notificationType |
|  reportData.reportFileType | Type of Cucmber report (HTML/JSON)   |
|  reportData.reportFilePath | Path to Cucmber report  |
| slack  | [REPORT DESTINATION] Wrapper for Slack intgreation properties storing  |
| slack.webHook  | Slack web hook transfer data |
| email  |  [REPORT DESTINATION] Wrapper for email properties|
| email.receivers | List of emails for sending test report notification|
| email.sendFrom | SMTP send from parameter to dispaly in email|
| email.subject | Email subject|
| email.smtpMailProperties | Storage of SMTP configuration propertries|
| email.smtpMailProperties.smtpHost | SMTP host|
| email.smtpMailProperties.smtpPort | SMTP port|
| email.smtpMailProperties.login | SMTP login|
| email.smtpMailProperties.password | SMTP password|

# Property must be stored by path:
 - src/test/resources/report-notification.yml 

# Plugin activation:

add this line to plugin definition annotation
`
"json:target/cucumber-reports/Cucumber.json",
        "io.genevjov.notifier.plugin.ReportNotificationPlugin"
`