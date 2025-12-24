# social-login-oauth2

Simple Spring Boot project providing OAuth2 login with GitHub and Google.

## Project structure

```
social-login-oauth2/
├─ `HELP.md`
├─ `mvnw`
├─ `mvnw.cmd`
├─ `pom.xml`
├─ `README.md`
├─ `src/`
│  ├─ `main/`
│  │  ├─ `java/`
│  │  │  └─ `com/`
│  │  │     └─ `oauth/`
│  │  │        ├─ `OauthApplication.java`
│  │  │        ├─ `config/`
│  │  │        │  ├─ `SecurityConfig.java`
│  │  │        │  └─ `WebConfig.java`
│  │  │        └─ `controller/`
│  │  │           ├─ `GeetingsController.java`
│  │  │           └─ `UserController.java`
│  │  └─ `resources/`
│  │     ├─ `application.yaml`
│  │     ├─ `static/`
│  │     └─ `templates/`
│  └─ `test/`
│     └─ `java/`
│        └─ `com/`
│           └─ `oauth/`
│              └─ `OauthApplicationTests.java`
├─ `target/` (build output)
│  ├─ `classes/`
│  │  ├─ `application.properties`
│  │  └─ `com/`
│  │     └─ `oauth/`
│  │        ├─ `OauthApplication.class`
│  │        ├─ `config/`
│  │        │  ├─ `SecurityConfig.class`
│  │        │  ├─ `WebConfig.class`
│  │        │  └─ `WebConfig$1.class`
│  │        └─ `controller/`
│  │           ├─ `GeetingsController.class`
│  │           └─ `UserController.class`
│  ├─ `generated-sources/`
│  │  └─ `annotations/`
│  ├─ `generated-test-sources/`
│  │  └─ `test-annotations/`
│  └─ `test-classes/`
│     └─ `com/`
│        └─ `oauth/`
│           └─ `OauthApplicationTests.class`
```

## Features

```
1. OAuth2 login via `github` và `google`.
2. Read configuration from environment variables (`.env`) mapped in `application.yaml`.
3. Maven build, runnable as a standalone JAR or from IDE.
```

## Requirements

```
1. Java 17+ (or project JDK).
2. Maven (mvn) — wrapper `mvnw.cmd` included.
3. Git (for source control).
```

## Environment

```
1. Create a file ` .env ` in project root (do not commit).
2. Copy from ` .env.example ` and fill provider client IDs/secrets.

Example environment variables (place values in ` .env `):
SPRING_APPLICATION_NAME=
SPRING_PROFILES_ACTIVE=
SPRING_SECURITY_USER_NAME=
SPRING_SECURITY_USER_PASSWORD=
GITHUB_CLIENT_ID=
GITHUB_CLIENT_SECRET=
GOOGLE_CLIENT_ID=
GOOGLE_CLIENT_SECRET=
SERVER_PORT=8080

Ensure ` .env ` is listed in ` .gitignore `.
```

## Setup & Run (Windows / IntelliJ)

```
1. Copy ` .env.example ` to ` .env ` and fill secrets.
2. Build:
    1. Run in terminal: `.\mvnw.cmd clean package`
3. Run:
    1. As jar: `java -jar target\*.jar`
    2. Or in IntelliJ: run `OauthApplication` main class.
```

## Development

1. Run unit tests: `.\mvnw.cmd test`
2. Run app in dev profile: set `SPRING_PROFILES_ACTIVE=local` in ` .env `.

## Security / Leaked Secrets

1. If a secret was committed and pushed, immediately revoke/regenerate it at the provider.
2. Remove from git history (tools: `git-filter-repo` or BFG) and force-push cleaned history.
3. Ensure ` .env ` is in ` .gitignore ` to prevent future leaks.

## License

Specify project license here (e.g., MIT).
