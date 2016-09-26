# MutationTesting

Mutation Testing sample

## Requirements

- I used Java8 to develop the presentation. The project should work with Java7, though i haven't tested it. 
- I used maven 3.3.9 for testing and presenting.

## Sources

I have used the slightly modified code samples from the following URL-s: 

- [https://blog.codecentric.de/en/2016/02/sensible-mutation-testing-dont-go-killing-spree-2/]
- [http://blog.xebia.com/mutation-testing-how-good-are-your-unit-tests/]
- [http://www.codeaffine.com/2015/10/05/what-the-heck-is-mutation-testing/]

Suggested read and blog, this is how i found pitest:
- [http://blog.cleancoder.com/uncle-bob/2016/06/10/MutationTesting.html]

## Presentation notes

Just run the following command:

> mvn clean cobertura:cobertura org.pitest:pitest-maven:mutationCoverage

This will clean the target dir, run a cobertura coverage calculation and after that, run a pitest mutation coverage report.

Cobertura report will be in: target/site/cobertura/

Pitest report will be in: target/pit-reports/{YYYYMMddHHmm}/