# Software Engineering og Testing, Oblig 3 - Git og Continuous integration
Software engineering og testing, oblig 3

Først gikk jeg inn i Actions, og satt opp "New Workflow" og valgte "Java with Maven"

Deretter ble det laga en ny fil som heter "Maven.yml", som jeg måtte gjøre litt endringer på, for å få den til å kjøre tester.

Kodene som ble brukt i filen er:

```yml
# This workflow will build a Java project with Maven, and cache/restore any dependencies to improve the workflow execution time
# For more information see: https://help.github.com/actions/language-and-framework-guides/building-and-testing-java-with-maven

name: JUNIT Test

on:
  push:
    branches: [ main ]
  pull_request:
    branches: [ main ]

jobs:
  build:

    runs-on: ubuntu-latest

    steps:
    - uses: actions/checkout@v2
    - name: Set up JDK 17
      uses: actions/setup-java@v2
      with:
        java-version: '17'
        distribution: 'adopt'
        cache: maven
        path: ~/.m2
        key: ${{ runner.os }}-m2-${{ hashFiles('**/pom.xml') }}
        restore-keys: ${{ runner.os }}-m2
    - name: Test with Maven
      run: mvn -B test --file pom.xml
```

Noen av endringene var at den skulle kjøre Java versjon 17, også måtte jeg legge inn: 
```yml
run: mvn -B test --file pom.xml
```

Slik at den kjørte testene.

Deretter lagra jeg, og den kjørte testen. Jeg fikk en grønn checkmark, som viser at testene er gjennomført og at alt var i orden. 

Hvis du går inn i detaljer på Maven.yml, og sjekker "Test with Maven", så vil resultatet også dukke opp.

Dette står på bunnen:
```
-------------------------------------------------------
 T E S T S
-------------------------------------------------------
Running LeapYearTest
Tests run: 8, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.08 sec

Results :

Tests run: 8, Failures: 0, Errors: 0, Skipped: 0

[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  2.416 s
[INFO] Finished at: 2021-11-05T11:48:10Z
[INFO] ------------------------------------------------------------------------
```

#####Kilder brukt:
[Dev.to](https://dev.to/ewefie/getting-started-with-github-actions-run-junit-5-tests-in-a-java-project-with-maven-20g4 "Title") - Artikkel på Github Action + Maven og JUnit.
