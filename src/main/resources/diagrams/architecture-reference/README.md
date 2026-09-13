# Servo current-state architecture reference

These Mermaid diagrams describe the behaviour implemented in this repository. They are not a target architecture or a redesign proposal.

Read in this order:

1. `01-system-context.mmd` — actors, external providers, and platform boundary.
2. `02-aws-component-topology.mmd` — current CDK stacks and runtime components.
3. `03-application-lifecycle.mmd` — application data and verification lifecycle.
4. `04-verification-state-machine.mmd` — current Step Functions orchestration.
5. `05-llm-adjudication.mmd` — detailed current LLM adjudication control flow.
6. `06-decision-ownership.mmd` — which component owns each decision.
7. `07-data-security-retention.mmd` — data boundaries, encryption and disposal.
8. `08-reliability-operations.mmd` — retries, DLQs, telemetry, and recovery.
9. `09-deployment-environments.mmd` — sandbox/prod topology and deployment path.

## Notation

- Solid arrows move requests, events, or data. Dashed arrows represent operational observation or conditional relationships.
- Orange boxes are external providers; purple boxes are orchestration/AI decisions; red boxes are terminal failure or held-review paths; green boxes are successful completion paths.
- **Trusted** means backend-derived values. Applicant-entered values and uploaded file contents are treated as untrusted input, even when later stored by Servo.

## Canonical sources

Use `infra/lib/servo-stack.ts` and `infra/lib/stacks/*.ts` for deployed topology, `infra/lambda/verification/*` for workflow behaviour, `infra/lambda/shared/types/*` for state/data contracts, `openapi/*.yaml` for HTTP interfaces, and `infra/lib/config/environments.ts` for environment values. Existing focused diagrams in the parent directory provide deeper payment and dispute journeys.

Last verified against checked-in source: 2026-09-13.
