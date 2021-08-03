# ServiceStack for Rider

[![Rider](https://img.shields.io/jetbrains/plugin/v/17295-servicestack.svg?label=rider&colorB=0A7BBB&style=for-the-badge&logo=data%3Aimage%2Fpng%3Bbase64%2CiVBORw0KGgoAAAANSUhEUgAAADAAAAAsCAYAAAAjFjtnAAAAAXNSR0IArs4c6QAAAARnQU1BAACxjwv8YQUAAAAJcEhZcwAADsMAAA7DAcdvqGQAAAAZdEVYdFNvZnR3YXJlAHBhaW50Lm5ldCA0LjAuMjHxIGmVAAAEEklEQVRoQ%2B2ZS0hUURjHLSoKominVIta1aLaFYhBES1t1bLFRCAREbQKaiHpqgeEpjDjRhIFHWwzIyo6oWXqwmfkW0evr9TxNT7GcZxX%2FzPzzZk53jsyc%2B91I%2FcHB4a5%2F%2B%2B79z%2Fn3O98RzOOBKFQ6BeGlOrw%2B%2F2S0%2Bn83dXV9a6srOwSpUlKfX19yvnn5%2BelwcFBW09Pz8uamporlOJgEOgMq2R7ezuAm33Cx%2BOUTgYMqMq%2Ft7cX7O3t7QbXKJUyWgzEWFhYaMONTlJKAbUGYvh8vjBymy0Wi2J%2BXQwwxsbGvlFKAa0GGHjG8Nra2nd8lM%2B0kgGPx9OK76sSx9LSkgNrfyMQCOySTAAxodLS0uuUlqNkAPnG9%2BdfWVlxLC8vs%2FxBkskYHx%2B3Udo4CJbdoKqqKpcuy8DLmzU3N%2FeTpAJTU1MfSMZRMoBCYKHLMhwOx12YacBzkVpkeHjYRNIo6RpgsPXodrtdJOdgvdpJwknXQIyRkZE3mA2KiIP7LqJCnSGZOgMM3MBOcg5y6WaAsb6%2B%2Fp5CBDo7O5%2BSRL0BTOWhG2hpaTnt9Xr%2FURhndna2lSTqDWxtbUkk50xOTupqgDE9PV1AYZzV1VVXXl5etKyma6C8vDwTJa2GpALY1J6QjKPVAGY6l8I4mJVwR0dH9D1QMtDW1ubCjaXE0dDQIA0MDEj45f0kE0DlmMeUn4gkTUCrgYqKCpkBxszMTHID6YJq4cVU50QS7kOrAZvNJjOAZ9bPAHoWT3Nz84tIMgW0GsC%2B84rCOFjCYV5K1RpgPQo2tKbi4uLbkURJ0GoALUo3hXHQRP7BpWMRgZIBrGcPpmgjNjY3N2XtA16knb6%2BvouRJAegxUB1dXVuMCjvLCYmJspIomwA3wlVqL29PXt3d1e2t6MeD%2BTn58te3ETUGkDByMTyHKMQDmL9drv9FslSM8DAzvuRLgtgjX4miSJqDOCdugfNKMkFJElqIlmUVA0w0PdPkISDmQk3NjZmk0SGkgF0tq2VlZWm2ECpNFmtVtPi4uJzLN8fuD8pRdBa%2BIaGhrIodZR0DKCk5WBafSTj4IEmMeWnSCagZEANmBEPVsEDShsnHQOM%2Fv7%2BLyQTQPKvJBHQwwCqjhet%2Bn1KKZKuAfQg51GH%2F5KUw5bS6OjoHZJxtBjAr876q14ssxuUTk66Bhg4dNzECYzUcbAv7KCPukCyCGoMIPcaGjYrK6NIEa33ycBb%2FRhtgClx4EEu0%2BWkoPo83B%2FHBo59QqzZbH4LE7UHjbq6ulpsjM9QJEwFBQWPlHoqAwMDAwMDAwODo0hJScnZoqKic3oOHPST%2Fs9Md1wulxMjrNfAuZYdbK5S%2BsNH6UCjBfZ3HJgwDKQMDLzGKNRrwECh2%2B0WjpUGimRk%2FAdgThdOY4UJ9QAAAABJRU5ErkJggg%3D%3D)](https://plugins.jetbrains.com/plugin/17295-servicestack)

ServiceStackRider is a plugin for the Jetbrains Rider IDE to support building client applications for ServiceStack services in the simplest possible way. Leveraging ServiceStack's NativeTypes feature, ServiceStackIDEA makes it easy to work with ServiceStack DTOs by providing intuitive menus for adding ServiceStack references and importing the associated client libraries as dependencies.

## C#, F#, VB.NET and TypeScript support

![](https://raw.githubusercontent.com/ServiceStack/Assets/master/img/servicestackidea/servicestack-rider-add-menu.png)

ServiceStackRider supports TypeScript for all project types and automatically detects which language to incorporate into your project based on the project type you are using.

<p align="middle">
  <img src="https://raw.githubusercontent.com/ServiceStack/Assets/master/img/servicestackidea/servicestack-rider-add-ref-dialog.png" />
</p>

Required NuGet dependencies are automatically imported into your project when adding new DTOs.

<p align="middle">
  <img src="https://raw.githubusercontent.com/ServiceStack/Assets/master/img/servicestackidea/servicestack-rider-add-ref-csharp.png" width="240" />
  <img src="https://raw.githubusercontent.com/ServiceStack/Assets/master/img/servicestackidea/servicestack-rider-add-ref-fsharp.png" width="295" /> 
  <img src="https://raw.githubusercontent.com/ServiceStack/Assets/master/img/servicestackidea/servicestack-rider-add-ref-vbnet.png" width="310" />
</p>


## Update your DTO files
Your DTO files can be updated from within the IDE by either right clicking on them or using the lightbulb menu.

<p align="middle">
  <img src="https://raw.githubusercontent.com/ServiceStack/Assets/master/img/servicestackidea/servicestack-rider-add-ref-update.png" />
</p>

