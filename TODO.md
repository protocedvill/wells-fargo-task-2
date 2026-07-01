# Auto-iteration backlog

- [ ] Add missing `@Entity` annotation to `Portfolio` and `Security` (src/main/java/com/wellsfargo/counselor/entity/Portfolio.java, Security.java) — both declare `@Id`/`@GeneratedValue` but Hibernate won't manage them as entities without `@Entity`.
- [ ] Fix `Client.advisor` mapping in Client.java: it's annotated `@OneToMany(mappedBy = "client.advisor")` on a single `Advisor` field, which is invalid JPA; should be `@ManyToOne` since each client belongs to one advisor.
- [ ] Fix `Security.portfolio` mapping in Security.java: it's annotated `@OneToMany(mappedBy="Portfolio.listOfSecurities")` on a single `Portfolio` field, which is invalid JPA; should be `@ManyToOne` since each security belongs to one portfolio.
- [ ] Fix `Portfolio.client` mappedBy value in Portfolio.java: `@OneToOne(mappedBy="Client.portfolio")` should be `@OneToOne(mappedBy="portfolio")`, referencing the owning field name on `Client` rather than a dotted class path.
- [ ] Add `spring-boot-starter-test` to pom.xml and a basic test verifying the entity relationships map correctly (currently there are zero tests in the project).
