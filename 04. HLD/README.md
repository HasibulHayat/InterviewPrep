# System Design — 12‑Week Step‑by‑Step Syllabus

**Overview**

This syllabus takes you from fundamentals to advanced system design with hands-on projects and interview practice. Target: 12 weeks (6–10 hours/week). Includes weekly learning goals, concrete exercises, mini‑projects, and an interview checklist.

---

## How to use this syllabus

1. Spend the first 1–2 days each week reading/watching core concepts, then use the rest of the week for exercises and the mini project.
2. Always practise drawing architecture diagrams by hand or in a diagram tool; explain trade‑offs aloud.
3. Pair every concept with a small implementation, simulation, or capacity/latency calculation.
4. For interview prep, treat weeks 9–12 as mixed study + mock interview weeks.

---

## Week 1 — Foundations & mental models

**Goals:** Understand system design vocabulary, high‑level tradeoffs, and how to structure a design conversation.

**Topics:** latency vs throughput, availability, consistency, scalability, fault tolerance, single points of failure, vertical vs horizontal scaling.

**Do:**
- Learn the standard interview structure (Clarify → Goals → Capacity → HLD → Components → Data model → Deep dive → Tradeoffs → Summary).
- Draw diagrams of a simple web app: browser → load balancer → app servers → database.
- Read 1–2 primer chapters/articles (basic distributed systems concepts).

**Exercise:** Design a simple URL shortener (no code necessary). Do capacity estimates for 100M users.

---

## Week 2 — Networking, HTTP, APIs & load balancing

**Goals:** Understand how clients talk to servers, API design basics, and LB strategies.

**Topics:** TCP vs UDP, HTTP/1.1 vs HTTP/2 basics, REST vs gRPC, load balancers (L4 vs L7), reverse proxy, sticky sessions, TLS basics.

**Do:**
- Design an API for a "Create post" endpoint (request/response shapes, error handling, idempotency).
- Draw load‑balancer architecture for a multi‑region app.

**Exercise:** Implement a simple REST API (or mock) and test with curl/postman.

---

## Week 3 — Data modeling & storage systems

**Goals:** Choose between SQL/NoSQL; design basic schemas; understand indexing and partitioning.

**Topics:** relational vs key‑value vs document vs wide‑column stores; normalization vs denormalization; indexes; primary keys; data partitioning strategies (range, hash, consistent hashing).

**Do:**
- Design the data model for Twitter feed and for an e‑commerce orders table.
- Practice choosing a storage type for different use cases.

**Exercise:** Build a prototype that stores and queries posts using a simple database (SQLite/Postgres or a document store mock).

---

## Week 4 — Caching, CDNs & performance

**Goals:** Reduce latency and load using caches and CDNs; learn cache invalidation strategies.

**Topics:** cache levels (client, CDN, edge, app level), cache eviction policies (LRU, TTL), cache-aside vs write-through, CDN basics.

**Do:**
- Design cache placement for a media site and for an API.
- Solve the cache invalidation tradeoffs for user profile updates.

**Exercise:** Add a Redis/memcached layer (or simulate) in front of your data store for read-heavy routes.

---

## Week 5 — Message queues & asynchronous processing

**Goals:** Introduce decoupling with queues, retries, dead‑letter queues, and background workers.

**Topics:** pub/sub vs queue, delivery semantics (at‑least‑once, at‑most‑once, exactly‑once), backpressure, rate limiting.

**Do:**
- Architect a system for sending email notifications asynchronously.
- Design retry and DLQ strategy for failed jobs.

**Exercise:** Prototype a worker that consumes from a queue (e.g., RabbitMQ, Kafka simulation, or simple in‑memory queue).

---

## Week 6 — Consistency, replication & partitioning

**Goals:** Learn replication strategies, consistency models, leader/follower patterns, and CAP constraints.

**Topics:** synchronous vs asynchronous replication, quorum reads/writes, eventual consistency, leader election basics.

**Do:**
- Study when to choose strong vs eventual consistency.
- Design multi‑region replication for a user profile service.

**Exercise:** Run small experiments (or thought exercises) calculating staleness and quorum durability for sample workloads.

---

## Week 7 — Availability, Fault tolerance & Monitoring

**Goals:** Make systems resilient and observable.

**Topics:** health checks, circuit breakers, retries with exponential backoff, bulkheads, service meshes (conceptual), metrics, logging, distributed tracing, SLIs/SLOs.

**Do:**
- Add monitoring and alerting plan to an existing design (what to monitor, alert thresholds).
- Describe an incident response plan for database outage.

**Exercise:** Instrument a small app with basic metrics (request rate, error rate, latency percentiles).

---

## Week 8 — Security, auth & rate limiting

**Goals:** Secure APIs and data; control abuse.

**Topics:** OAuth/JWT basics, API keys, TLS, input validation, encryption at rest/in transit, rate limiting strategies, WAF overview.

**Do:**
- Design auth flow for a mobile + web app (access/refresh tokens, revocation).
- Add rate limiting to a public API design.

**Exercise:** Implement a simple token-based auth for your REST prototype.

---

## Week 9 — Scalability patterns & system design patterns

**Goals:** Recognize repeatable patterns and when to apply them.

**Topics:** sharding, partitioning, leaderboards (sorted sets), materialized views, CQRS, event sourcing (conceptual), fan‑out vs fan‑in.

**Do:**
- Design a scalable leaderboard and discuss consistency tradeoffs.
- Compare CQRS vs simple CRUD for a high‑write service.

**Exercise:** Prototype a leaderboard using sorted sets (or simulate) and measure performance in thought experiments.

---

## Week 10 — Databases at scale & advanced storage

**Goals:** Explore denormalization, OLAP vs OLTP, data warehousing, and search.

**Topics:** columnar stores, OLAP pipelines, data lakes, search engines (Elasticsearch basics), asynchronous ETL.

**Do:**
- Design an analytics pipeline (event ingestion → processing → warehouse → BI).
- Add full‑text search capabilities to a product search design.

**Exercise:** Create sample ingestion flow and sketch schemas for OLAP tables (fact/dimension tables).

---

## Week 11 — Putting it together: case studies

**Goals:** Walk through several end-to-end system designs and tradeoffs.

**Case studies:** URL shortener (scale/analytics), social feed (fan‑out vs fan‑in), chat app (real‑time delivery), e‑commerce checkout (consistency/transactions), metrics collection pipeline.

**Do:**
- For each case, create HLD diagrams, component responsibilities, data flows, and failure modes.

**Exercise:** Pick two case studies and write a 15–20 minute walkthrough as if in an interview.

---

## Week 12 — Interview practice, mock interviews & roadmap ahead

**Goals:** Consolidate skills for interviews and production readiness.

**Do:**
- Do 3–5 timed mock designs (30–45 minute sessions) with peers or recording yourself.
- Review and tighten your templates: HLD, capacity, API, data model, bottlenecks, tradeoffs.
- Create a personal cheat sheet of quick facts (consistency patterns, caching strategies, common numbers for capacity planning).

**Exercise:** Full mock interview: design a large scale chat or feed system; record and critique.

---

## Projects (pick 3—start small, add features)

1. **URL Shortener** — tiny scope, analytics, custom domains.
2. **Write‑heavy Social Feed** — fan‑out, read optimization, feed generation.
3. **Realtime Chat** — websockets, presence, message durability.
4. **E‑commerce Checkout** — inventory, payments, idempotency, transactions.
5. **Metrics Pipeline** — high ingest, downsampling, dashboards.

Each project: define requirements, capacity, HLD, data model, deep dive on one component, failure modes, monitoring plan.

---

## Interview checklist & sample prompts

**Structure to follow in interviews:**
- Clarify requirements & constraints
- Estimate scale (QPS, data sizes, growth)
- High‑level architecture
- API and data model
- Component deep dive (pick 1–2)
- Bottlenecks & tradeoffs
- Wrap up with summary and optional improvements

**Sample prompts:**
- Design Twitter’s timeline.
- Design a URL shortener with custom domains & analytics.
- Design a notifications service (email/push/SMS) at scale.
- Design a rate limiter for a public API.
- Design a real‑time collaborative editor (conceptual).

---

## Tools, books & resources (recommended reading)

- Books: *Designing Data‑Intensive Applications* (Martin Kleppmann), *System Design Interview* (Alex Xu), *Distributed Systems: Concepts & Design* (Coulouris et al.).
- Blogs & sites: High Scalability, engineering blogs from major companies (read case studies).
- Papers: CAP theorem, Raft, Dynamo/Bigtable/Spanner papers (read summaries or full papers for advanced study).
- Tools: draw.io, Excalidraw, Miro, diagrams.net for diagrams; Postman/curl for APIs; Redis/Kafka/RabbitMQ for queues; JMeter/hey/locust for load testing.

---

## Assessment & next steps

- Weekly mini‑quizzes: quick prompts to check concepts.
- By week 6: complete one mini project. By week 12: complete two end‑to‑end projects and 3 mock interviews.
- After finishing: pick advanced topics to deepen (consensus algorithms, networking internals, cloud native design, Kubernetes patterns, service meshes).

---

## Variations & pacing

- **Fast track (4 weeks):** compress by doing 3–4 topics/week and only 1 project (intense daily study).
- **Moderate (12 weeks):** default plan above.
- **Deep dive (16+ weeks):** add extra weeks for distributed consensus, testing at scale, cloud infra, and multiple large projects.

---

## Final notes

- Focus on explaining tradeoffs clearly — system design interviews reward clear, structured thinking more than perfect technical recall.
- Draw, speak, and iterate. Build a portfolio of diagrams and short writeups for each project you complete.

Good luck — treat each week as a mini‑mission. When you’re ready, I can: 1) compress this into a 4‑week sprint, 2) expand to a 16‑week plan with daily tasks, or 3) produce a printable PDF version of this syllabus.

