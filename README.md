# cucmber-report-notification-plugin
Report notification plugin for Cucumber framework

Property structure for reporting:

```yaml
slack:
  reportData:
    type: "PLAIN_FAIL_REPORT"
    reportFileType: "changeme"
    reportFilePath: "changeme"
  webHook: "changeme"
email:
  reportData:
    type: "HTML"
    reportFileType: "changeme"
    reportFilePath: "changeme"
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
# Property must be stored by path src/test/resources/report-notification.yml
| Property name | Meaning  |
| ------------ | ------------ |
|  reportData | Storage for notification type, Cucumber report type, path to report |
|  reportData.type | Notification content type |
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
