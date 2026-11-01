# DSA Chapter Completion Workflow — Notes and Evidence

This file owns **when and how a chapter is declared complete** and **what must be published**. Teaching style is in [Teaching Playbook](TEACHING_AND_VISUALS_PLAYBOOK.md), pair coding in [Problem Solving Workflow](PROBLEM_SOLVING_WORKFLOW.md), and GitHub transaction safety in [Repository Maintenance](REPOSITORY_MAINTENANCE.md).

## Completion trigger and proactive recommendation

**The tutor must proactively audit coverage**, especially after representative practice. Summarize what the syllabus requires, what the student has already understood, what was attempted, and what remains unknown. Say clearly when the chapter appears **ready to mark COMPLETED**, then **wait for explicit learner confirmation**.

Do not turn "well done", "thanks", silence, a code commit or a finished explanation into automatic approval. A user saying `COMPLETE CHAPTER`, or unequivocally agreeing to a completion recommendation, authorizes the full completion-and-publishing workflow.

**Completion** means the agreed chapter learning and documentation lifecycle is finished. It does **not** mean perfect independent mastery, Principal readiness or all optional LeetCode questions solved. A difficult optional variant can become revision practice without blocking closure if the essential syllabus scope is covered.

## 1. Coverage and evidence audit — before publishing

For the chapter ID, review [SYLLABUS](../Curriculum/SYLLABUS.md), [CONTENTS](../ProgressTracker/CONTENTS.md), [DAILY LOG](../ProgressTracker/DAILY_LOG.md), code attempts and applicable instructions. Ensure sufficient coverage of:
- Problem motivation, accurate concepts, data structures and constraints.
- Worked visual examples and meaningful internals.
- Correctness reasoning/invariants and time/space trade-offs.
- Interview-relevant edge cases and common mistakes.
- At least enough relevant hands-on practice to judge understanding; **2–4 problems is a flexible guideline, not a mandatory quota**.
- Key follow-up variations and a succinct interview-oriented explanation.

**Evidence separation:** label independent learner reasoning/coding, hints, pair-coded, tutor-given and unattempted material. A solved exercise counts as useful practice regardless of help level but does not establish independent mastery. Identify one or two high-priority revision gaps rather than assigning infinite new problems.

## 2. Chapter artifact contract

Create **one canonical Markdown chapter note** only at approved completion, under a clear topic/chapter path within `Notes/`. Example *future path*, not a pre-created folder:

`Notes/02-Linked-Lists/Linked-Lists-and-Pointer-Patterns/README.md`

A standalone chapter note should be useful to a reader outside the chat and include the following (combine nearby headings when more readable):

1. **Header:** Chapter title, stable `DSA-x.xx` ID, completion date, objectives and prerequisites.
2. **Why it matters:** Typical interview scenarios and a relatable problem/story as appropriate; explicitly map analogy to algorithm and its limitations.
3. **Intuition and rigorous mechanism:** Definitions, representations, critical operations, correct invariants, input assumptions and technical detail proportional to the syllabus.
4. **Worked examples and visualizations:** Step-by-step dry runs, arrays/pointers/recursion trees, graph/DP state tables, Mermaid diagrams, and readable original visuals where useful.
5. **Java approach:** Core implementation patterns or concise reusable illustrative snippets, explaining design decisions. Avoid duplicating the entire practice-code repository in the note.
6. **Correctness, complexity and trade-offs:** Time/auxiliary space, edge cases, alternatives, why common wrong approaches fail, relevant Principal follow-ups.
7. **Common mistakes:** General traps and accurately attributed learner-specific corrections; do not invent learner attempts.
8. **Solved Practice Questions table:** **Mandatory**, linking to verified real Java solutions already committed during the lesson or explicitly published as part of approved completion.
9. **Additional LeetCode Practice table:** **Separate** suggested/revision problems with verified LeetCode URLs, not falsely presented as solved.
10. **Concept checkpoints and explanations:** Short revision questions and, in a separate clearly marked answer-key area, complete explanations for discussed non-coding concept checks. For new unattempted coding challenges, give prompts and optional graduated hints, **not completed Java answers**.
11. **Interview recall sheet:** Core pattern, invariants, complexity reminders, chosen problem variations and a quick revision summary.
12. **Assessment and follow-up:** What was independent vs guided; strengths, gaps and next revision exercise. Optional verified references and caveats.

No empty placeholder sections, invented quantitative ratings, false references or broken links.

## 3. Mandatory solved-problem table

For every **actually solved and committed** problem referenced in the lesson:

| Problem | Pattern / technique | Java solution | Solving mode |
|---|---|---|---|
| Reverse Linked List (example only) | Pointer reversal | Relative link to **verified existing** `ReverseLinkedList.java` | Independent / Hint-assisted / Pair-coded / Tutor-provided |

The row above is a **format demonstration only**, not evidence the file exists. At publication:
- Use meaningful problem names and a short pattern label.
- Resolve link paths **relative to the chapter Markdown file**. If the solution lives in another repository, use its exact verified canonical URL and label its repository.
- Include help level honestly; a fully correct pair-coded solution is acceptable, but never report it as independently solved.
- If no solved practice is available, use one truthful table row such as **"No committed solutions for this chapter yet"** and explain what practical coverage evidence exists; do not fabricate a Java link. Evaluate whether that gap should block chapter completion if the objective specifically requires code.
- Verify every linked Java file really exists in the committed tree; if a newly solved file is part of the same approved commit, check the resulting tree and fetch it after publication.

## 4. Separate optional LeetCode table

| LeetCode problem | Why to practice / pattern | Official link | Status |
|---|---|---|---|
| Short descriptive title | Variation or gap addressed | Verified public problem URL | Suggested / Revisit / Unattempted |

Never guess problem number/slug/URL. If links are unverified, omit until verified or mark them as text-only suggestions; do **not** create dead URLs. Do not duplicate completed solutions just to populate this optional table. A question can be a good revision candidate without becoming a mandatory completion blocker.

## 5. Diagrams and assets

- Favor maintainable GitHub-renderable **Mermaid + Markdown** visuals; use original SVG/PNG/WebP only when a concrete visual need warrants it.
- A chapter may have several focused visuals showing **mechanism, trace, edge case and key trade-off**. Store original assets inside a chapter-local `assets/` folder only when needed and permitted.
- Explain what each significant diagram depicts, include alt text for images and check readable contrast, GitHub rendering and relative paths.
- Verify Mermaid syntax (including special characters and quoting), image paths and correct node/arrow labels; do not claim all Mermaid variants support animation.
- Do not reproduce copyrighted visuals or full paid problem statements.

## 6. Completion pipeline — coordinated, verified update

On explicit approval:

1. **Freeze chapter ID and evidence.** Check syllabus scope, latest Daily Log and real problem implementation paths. Identify which outputs will change.
2. **Prepare final note:** Write comprehensive original prose, accurate diagrams/assets, Java guidance, worked examples, solved-practice table, separate optional LeetCode table, revision summary and honest assessment. Preserve full topic coverage without adding research scope.
3. **Validate practice artifacts:** Verify each already saved Java file, or publish any newly reviewed, explicitly approved solution along with the chapter. Link only real paths; preserve existing code unchanged.
4. **Prepare navigation:** Update the specific [CONTENTS](../ProgressTracker/CONTENTS.md) chapter row's **Notes** link to the new note; **Practice code** links to actual implementation(s), not nonexistent placeholders. Preserve all other entries and the canonical syllabus chapter IDs.
5. **Prepare status:** If `ProgressTracker/PROGRESS.md` exists, change *only this chapter's* status from STARTED to COMPLETED; record a defensible `N/5` **discussion/coverage rating**, not a mastery percentage. If it does not exist, **do not claim it was updated**; explicitly flag the missing tracker. Ideally initialize it in a separately authorized step before tracked study.
6. **Prepare dated log:** Append/update the same-day [DAILY_LOG](../ProgressTracker/DAILY_LOG.md) entry: concepts, real learner evidence, code/notes links, readiness gaps, completion consent, outstanding revision and precise next eligible chapter.
7. **Publish as one coherent change set** where possible: chapter notes, assets/code if authorized, Contents, Progress (if present) and Daily Log in a single commit based on the latest branch head. See [repository safety](REPOSITORY_MAINTENANCE.md).
8. **Verify after GitHub write:** Read back all changed files, validate links/assets/code, confirm the branch HEAD and commit changed-file list, ensure no unrelated edits or stale completion statuses. If any part fails, do not claim a complete publication—repair or report actual state first.
9. **Close the session:** Link the completed chapter, give a concise learning/evidence recap, tell the learner any revision gaps and the next chapter. No inflated mastery claim.

**Important:** If a critical tracker is missing and this would prevent consistent completion records, disclose it and obtain authorization to initialize it instead of inventing a completed state. Do not leave mismatched Notes/Contents/Progress/Log claims.

## 7. Readiness versus chapter completion

- **Status:** `NOT STARTED`, `STARTED`, `COMPLETED` (only where canonical Progress exists).
- **Discussion coverage rating (optional on completion):** 1/5 = introductory, major gaps; 2/5 = partial with extensive guidance; 3/5 = useful coverage, limited independence; 4/5 = strong discussion/practice with clear remaining gaps; 5/5 = exceptional demonstrated coverage and application. A completed chapter need not score 5/5.
- **Independent coding readiness:** assessed separately via fresh and timed problems; record "not assessed" if no such evidence exists.
- **Principal/Architect interview readiness:** require actual follow-up/trade-off responses, not just a published note.
- Do not infer confidence from historic Java files or the number of LeetCode solutions.

## 8. Partial failure and preservation

When GitHub publishing fails or is inaccessible, preserve only truthful successful writes, explain what is missing, and do not mark the chapter fully published if its note/links/status are inconsistent. Reconcile the latest HEAD before retrying. The exact transaction procedure lives in [REPOSITORY_MAINTENANCE.md](REPOSITORY_MAINTENANCE.md).
