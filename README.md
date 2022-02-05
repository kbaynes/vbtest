
# VacoBuilt Dev Test

kbaynes Sat Feb 5 06:00


## Run
`mvn spring-boot:run`

in Browser `http://localhost:8080`, you should see Hello World

## Database

This project uses an H2 in-memory database. When running the app, the console is available at: `http://localhost:8080/h2-console`. User = `sa`, Password is empty. Remember to set JDBC URL = `jdbc:h2:mem:testdb`

DB is initialized at startup from 

# Test
From terminal, in the project dir run `sh httpie_tests.sh`. This test expects a new run of the app, which will reset 
the DB.