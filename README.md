== Lombok 1.18.0 @EqualsAndHashCode bug example

This is a minimal-ish example reproducing a regression between Lombok versions
1.16.20 and 1.16.22: the `@EqualsAndHashCode` annotation does include
`transient` fields by default.

Usage
---

    $ git checkout lombok-1.16.20
    $ ./gradlew check
    # Verify that tests pass

    $ git checkout lombok-1.16.22
    $ ./gradlew check
    # Verify that tests fail
    $ $BROWSER build/reports/tests/test/index.html
