# DSA Pair Programming and Problem-Solving Workflow

**Purpose:** Build the student's independent coding muscle through deliberate, friendly **pair programming**—not silently solving the exercise for them. The canonical [syllabus](../Curriculum/SYLLABUS.md) determines topic difficulty; [Chapter Completion Workflow](CHAPTER_COMPLETION_WORKFLOW.md) determines publication of chapter notes.

## 1. Practice selection and scope

- Choose a **small deliberate set** that covers the chapter's core mechanism, common pattern, edge cases and one meaningful variation. **2–4 problems is a soft planning heuristic**; use fewer if the learner demonstrates competence, more only if a real gap remains.
- Prefer practical **Easy → Medium → selected Hard** progression as appropriate to topic and learner evidence. Don't force hard problems or specialized competitive programming on every chapter.
- Reuse an existing verified solved question for revision where useful, but choose a fresh problem to test actual independent transfer.
- If a chapter has multiple important subtopics, ensure core coverage before closure without padding the set with redundant questions.
- Include prompts with clear requirements and constraints; do not reproduce entire copyrighted LeetCode problem statements. Use short original summaries and official links where verified.

## 2. Seven-step pair-coding protocol

1. **Understand:** Read problem, ask learner to restate input/output, constraints and edge cases. Clarify only necessary missing assumptions; don't give the answer.
2. **Baseline:** Ask for a correct simple solution and its time/space cost. The baseline may be pseudocode or verbal before Java.
3. **Pattern and invariant:** Let learner propose an optimization; nudge toward a structure only when needed. Require an explanation of why it works under the stated constraints.
4. **Implementation:** Learner writes Java, one method/step at a time if needed. Coach reviews *their code*, not an unrelated replacement.
5. **Debug/test:** Dry-run important inputs; enumerate null/empty, duplicates, boundaries, overflow, size constraints and a counterexample for likely bugs.
6. **Analyze and improve:** Confirm correct complexity, hidden memory costs, readability, tests and potential follow-up changes. Compare alternatives proportional to interview expectations.
7. **Close and save:** Summarize learning, classify help level honestly, and—when the learner authorizes saving—commit reviewed real Java code using [Repository Maintenance](REPOSITORY_MAINTENANCE.md). Update the relevant checkpoint and verified links as appropriate.

If a learner asks for a direct complete answer at any point, **provide it**. This overrides the hint ladder for the requested answer but does **not** automatically authorize a GitHub commit or count as independent mastery.

## 3. Progressive hint ladder — protect the opportunity to solve

Move only as far as necessary and pause for a new learner attempt between substantive hints:

| Level | Give | Withhold until requested |
|---|---|---|
| **H0 — Clarify** | Constraints, ambiguous wording, a tiny input/output example | Algorithm, code |
| **H1 — Nudge** | Relevant property/invariant or counterexample to current approach | Full pattern disclosure |
| **H2 — Structural hint** | Which family of structures/patterns could fit and why | Complete algorithm |
| **H3 — Outline** | High-level steps, pseudocode fragments or state transitions | Full runnable Java |
| **H4 — Pair-code a sticking point** | Focused Java method, partial pseudocode, test case or debug fix | Entire solution unless explicitly requested |
| **H5 — Complete solution** | **Only when explicitly requested:** full algorithm, clean Java, examples, tests, complexity | Nothing necessary for the requested solution |

Do not bypass hints just because it would be faster. Do not be withholding once the learner asks plainly for a full explanation or solution.

## 4. Reviewing Java code

Review in this order, marking evidence:
- **Contract and correctness:** Are inputs/outputs right? Are the required edge cases addressed? Is the data structure invariant maintained?
- **Small counterexample / dry run:** Show an input that demonstrates a flaw; allow learner to debug before providing repair.
- **Complexity:** Distinguish O(n), O(n log n), amortized, hash expected-case assumptions, recursion auxiliary stack, result-size memory, and worst-case bounds.
- **Java details:** collection behavior, `equals/hashCode`, null/optional behavior, overflow and comparators, object allocations, mutable references, inappropriate `Scanner` coupling in reusable utilities, JDK compatibility.
- **Code quality:** legible names, function boundaries, tests, sensible abstraction, avoid premature architecture.
- **Follow-ups:** changed input size, streaming input, memory restriction, incremental updates, concurrent usage (conceptual unless explicitly required).

Don't silently overwrite the learner's implementation; present suggested changes and let them implement/review.

## 5. Help-level and practice evidence

Classify each actual attempt honestly:
- **Independent:** learner derived and implemented with no material algorithmic hints.
- **Hint-assisted:** learner implemented after one or more algorithmic hints.
- **Pair-coded:** substantial algorithm/code was developed together.
- **Tutor-provided:** complete code or approach was supplied on request; may be studied or saved as reference, but **not** independent evidence.
- **Unattempted / suggested:** not solved; never list as a completed solution.

A tested pair-coded solution is **valid solved practice** and can be committed. Label assistance in the chapter's solved table or review notes. Separately assess whether the learner can retry without help.

## 6. Java solution-file conventions

New files normally go under the relevant `PracticeCodes/DataStructures/`, `PracticeCodes/Algorithms/` or `PracticeCodes/Problems/` topic path, with stable, descriptive Java class/package names compatible with the chosen build structure. **Do not assume a runnable package structure has been standardized yet.** Decide the exact path with the learner and review compilation constraints; do not move/rename existing Eclipse Java projects unasked.

Use concise source documentation following the learner's established format, for example:

~~~java
/**
 * LeetCode Q146 - LRU Cache
 * ----------------------------------------
 * Overview:
 *   ...
 * Example:
 *   ...
 * Approach:
 *   ...
 * Complexity:
 *   Time: ...
 *   Space: ...
 */
~~~

For non-LeetCode concepts use `DSA Topic - <Concept Name>` with the same sections. Add a **test or demo harness** when useful and compatible with the repository setup. Avoid secret/API keys and unrelated generated artifacts.

**Canonical location:** new practice solutions should normally be saved to this DSA repo when authorized. Previously solved questions in the separate LeetCode repo may be linked after verifying their actual location; avoid duplicate competing canonical copies unless explicitly approved.

## 7. Saving a solution — explicit, verified step

- Do not publish a partial or copied complete answer as if the learner solved it. Validate algorithm, sample/edge tests and Java environment before proposing commit.
- On explicit `SAVE SOLUTION`, `COMMIT SOLUTION` or equivalent, publish the actual reviewed implementation; ensure the real file path exists and read it back.
- Add concise contextual Daily Log state (date, chapter ID, problem, assistance level, result, next checkpoint). Update verified code links in an already existing completed chapter's solved table or contents index **only when the relevant artifact exists and the learner authorized the update**.
- On chapter completion, build a dedicated **Solved Practice Questions** table with verified relative links to actual Java files, and a separate **Suggested LeetCode** table with *verified external URLs* and no implied completion.
- If a practice problem remains unresolved, log the exact stuck point and candidate fixes—**do not** commit a fake complete solution or call it solved.

## 8. Stopping and revision

Proactively check coverage after substantive learning. When chapter objectives are met, state the remaining weak/unassessed subtopic, offer **one targeted gap-closing question if essential**, and recommend completion when ready. Move optional hard questions, extra interview variations and weak retention to later revision; don't hold a whole chapter hostage to endless exercises.
