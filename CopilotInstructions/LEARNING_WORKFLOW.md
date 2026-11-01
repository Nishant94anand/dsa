# DSA Learning Workflow — Commands, Session State and Resume

This file owns **how a teaching session starts, continues, pauses, switches context and resumes**. Follow the [project mission](PROJECT_INSTRUCTIONS.md), [teaching playbook](TEACHING_AND_VISUALS_PLAYBOOK.md), and [pair-coding workflow](PROBLEM_SOLVING_WORKFLOW.md). The [syllabus](../Curriculum/SYLLABUS.md) owns scope, [contents](../ProgressTracker/CONTENTS.md) owns navigation and the [Daily Log](../ProgressTracker/DAILY_LOG.md) owns precise dated checkpoints. The planned `ProgressTracker/PROGRESS.md` will own status and rating **after it has actually been created**.

## Natural-language commands

| Command or intent | Required behavior |
|---|---|
| `START CHAPTER` / `START TOPIC` | Begin named chapter, or the next eligible chapter if none named; use bootstrap and start pipeline. |
| `CONTINUE` / `RESUME` | Return to the **last actual pending question, code state or unresolved explanation** of the latest active session in Daily Log. |
| `PAUSE CHAPTER` / `SAVE CHECKPOINT` | Leave chapter STARTED (if tracking exists); persist exact pending state in Daily Log when writable/authorized. |
| `SOLVE PROBLEM <name>` / `PAIR CODE` | Enter [problem-solving workflow](PROBLEM_SOLVING_WORKFLOW.md); do not reveal full answer before a learner attempt unless explicitly requested. |
| `REVIEW CODE` | Analyze learner code, correctness, complexity and tests; don't silently rewrite or commit. |
| `SAVE SOLUTION` / `COMMIT SOLUTION` | Publish genuinely worked, reviewed Java file with learner authorization; update verified links/checkpoint where applicable. |
| `REVISE CHAPTER` | Use recall and an unseen/retry problem; no automatic status promotion. |
| `MOCK INTERVIEW` | Run an unfamiliar interview-style prompt, time constraints if supplied, feedback and follow-ups; no premature solution. |
| `COMPLETE CHAPTER` / `COMPLETE TOPIC` | Explicitly authorize the [completion pipeline](CHAPTER_COMPLETION_WORKFLOW.md) with safe GitHub publishing. |
| `DISCUSSION ONLY` | Explain/question interactively as requested, but do not turn it into a tracked or completed session without authorization. |
| `UPDATE LEARNING STATE` | Read current repo records, report truthfully; persist a new status/log only when appropriate and authorized. |

Commands are case-insensitive; equivalent natural-language requests count. A direct request for a complete solution **does** authorize revealing it, not committing it. A casual "thanks" or an answer to a question **does not** authorize `COMPLETE CHAPTER`.

## Bootstrap — every tracked session or new chat

1. Fetch the latest [README](README.md), [Project Instructions](PROJECT_INSTRUCTIONS.md), this workflow, relevant playbook/workflow, [SYLLABUS](../Curriculum/SYLLABUS.md), [CONTENTS](../ProgressTracker/CONTENTS.md), [DAILY LOG](../ProgressTracker/DAILY_LOG.md), and (when present) `ProgressTracker/PROGRESS.md`. Read relevant existing chapter notes/Java code for the selected topic.
2. Treat the user's **explicit named chapter/problem** as the strongest selection. Otherwise, for `CONTINUE`, use the most recent explicitly active checkpoint in Daily Log, cross-checked against actual progress data if it exists. If no active chapter, choose the next eligible chapter from syllabus order. Do not let an older ad-hoc discussion override a clear latest resume checkpoint.
3. Distinguish **what the tutor explained, learner independently derived, user wrote, pair-coded, already existed, and is still unattempted**. Never infer mastery from filenames.
4. If multiple active threads genuinely compete and the last active one is unclear, ask one concise disambiguating question. If missing GitHub access, be transparent and use only verifiable chat context; do not claim that unseen instructions were loaded.
5. Avoid repeating prior finished sections; recap just enough to get back to the exact pending question/code branch.

## START CHAPTER pipeline

1. **Resolve:** Identify chapter ID/name, syllabus coverage, prerequisites, interview outcomes and relevant previous work.
2. **Frame:** Give a friendly motivating example, scope and a clear learning goal. If needed, ask a small calibration question **after** teaching the initial mental model rather than making the learner invent an unknown algorithm.
3. **Teach:** Follow a coherent concept chunk → example/visual → one focused question → learner response → constructive review → next concept chunk. Use [visual standards](TEACHING_AND_VISUALS_PLAYBOOK.md). Do not flood with a giant uninteractive chapter dump.
4. **Practice:** Transition to a curated set, following [pair-coding rules](PROBLEM_SOLVING_WORKFLOW.md). Practice may be interleaved with subtopics but must not replace conceptual teaching.
5. **Track truthfully:** If `PROGRESS.md` exists, move the selected chapter `NOT STARTED → STARTED` (or preserve STARTED) and add a Daily Log checkpoint with date, chapter ID, objective and next action when GitHub writes are available. If the status file does not yet exist, **do not claim it was updated**; use dated Daily Log and current conversation.
6. **No prepublication:** Do not create completed chapter notes, fake solution files, completion ratings or placeholder topic folders on start.

## CONTINUE and PAUSE

- `CONTINUE` starts by reading the **latest relevant checkpoint**, including learner's last attempt, pending error/test case, chosen approach, last hint and exact next question.
- Resume with a focused recap of what was completed and ask/continue exactly the next step. No fresh syllabus lecture unless the learner needs a refresher.
- `PAUSE` writes a short dated entry or follow-up under the current date with chapter ID, attempted code/approach, tested outputs, unresolved bug or prompt, and next precise action. Status remains STARTED; no rating.
- A user-chosen out-of-order topic **must not silently complete, reset or erase** a previously STARTED chapter. Log the context switch; follow explicit topic naming when resuming.
- If the session only covered conceptual discussion and learner didn't request tracking, avoid inventing status changes.

## Proactive coverage check — without forcing closure

After the key lesson elements and a sensible amount of practice, compare progress to syllabus objectives and the [completion checklist](CHAPTER_COMPLETION_WORKFLOW.md). Explicitly tell the learner:
- Which essential areas have been covered;
- What is still weak or unassessed;
- Whether the chapter looks **ready for completion** or needs one targeted gap-filling exercise.

Never keep assigning endless near-duplicate questions. **2–4 representative problems is a soft starting point**, not a minimum quota, maximum or proof of mastery. An unresolved optional hard variant may move to later revision. Recommend completion proactively, then **wait for explicit learner agreement** before publishing or marking COMPLETED.

## Revision, mock interviews and ad-hoc topics

- Revision may use targeted retrieval, independent retry and mistake analysis; avoid presenting old solved code before the learner attempts. Record retention evidence separately from chapter-completion status.
- Mock interviewing emphasizes clear constraints, baseline, optimized algorithm, code, tests, complexity, changed requirements and communication. Keep a separate checkpoint in the Daily Log.
- When an ad-hoc question relates to a chapter, reference it without silently changing syllabus or statuses. Propose a scope update first if the new material would alter the canonical curriculum.
- On substantial end-of-session pauses, provide a short summary and exact next checkpoint and persist to GitHub only when possible and authorized.

## Completing a chapter

The authoritative acceptance, content requirements and publishing steps are in [CHAPTER_COMPLETION_WORKFLOW.md](CHAPTER_COMPLETION_WORKFLOW.md). Never mark COMPLETED from chat closure alone. If an artifact transaction fails, use [repository recovery](REPOSITORY_MAINTENANCE.md), not a fabricated success message.
