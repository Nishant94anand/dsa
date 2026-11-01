# DSA Repository Maintenance — Safe GitHub Operations

This file owns **how to read, modify, validate and commit** the learning system. It does not decide chapter scope (see [Syllabus](../Curriculum/SYLLABUS.md)) or what qualifies as completed (see [Completion Workflow](CHAPTER_COMPLETION_WORKFLOW.md)).

## 1. Repository authority and preservation

- Canonical repository: `Nishant94anand/dsa`; use latest accessible **GitHub** files as the authoritative record, not an unverified old chat copy.
- Current core directories: `CopilotInstructions/`, `Curriculum/`, `ProgressTracker/`, `Notes/`, `PracticeCodes/`, `Resources/`, plus legacy projects such as `LinkedList/`, `Stacks/`, `RecursionAndBacktracking/`, `Hashing/`, `DSATestProject/`.
- **Protect legacy work:** No moving, renaming, deleting, reformatting or opportunistically fixing existing Java code/config/root README without explicit authorization. Don't overwrite existing problem solutions when a new path or a separate discussion would be appropriate.
- Do not treat an empty planned folder/README as a finished lesson or implementation.
- The separate `leetcode` repository can be linked with verified URLs; avoid maintaining competing duplicate solutions unless authorized.
- Practice solutions normally live under `PracticeCodes/` after they have actually been worked through. Agree on package/build organization before assuming compilation from a particular path.

## 2. Sources of truth

| Information | Canonical file or artifact |
|---|---|
| Current chapter scope, sequence and IDs | [Curriculum/SYLLABUS.md](../Curriculum/SYLLABUS.md) |
| Ordered lesson/solution navigation | [ProgressTracker/CONTENTS.md](../ProgressTracker/CONTENTS.md) |
| Dated session state and exact resumption | [ProgressTracker/DAILY_LOG.md](../ProgressTracker/DAILY_LOG.md) |
| Chapter status and completion discussion rating | Future `ProgressTracker/PROGRESS.md` **only when actually created** |
| Completed concept teaching artifact | Verified chapter-local note under `Notes/` |
| Solved code | Verified Java file under `PracticeCodes/` or separately verified existing code |
| Workflow rules | Files in this instruction folder; [index](README.md) maps ownership |

When reading/using these paths, confirm they exist and the expected branch/ref is current. The planned `PROGRESS.md` is not yet present: **never make up its contents or claim synchronization with it**.

## 3. Before any GitHub change

1. Determine the user's **actual authorized scope** (read-only review vs commit, chapter note vs code vs instructions).
2. Fetch current branch HEAD and relevant existing content/identifiers. If uncertain about another writer's changes, refresh and reconcile.
3. Plan exactly which files are being created or updated. Preserve all unrelated files and existing statuses/ratings.
4. Check new paths don't conflict with existing files/classes; avoid accidental duplicate problem definitions.
5. Prepare content, internal references and review checks **before writing**.
6. For multiple related files, prefer a **single Git tree / commit** based on the current tree, rather than sequential inconsistent commits, when GitHub capabilities permit.

Never say a commit succeeded merely because content was drafted or a tree object was created; ensure the intended branch ref was advanced successfully.

## 4. Link and content validation

- Use **relative Markdown links** for same-repo notes, Java solutions, resources and Contents navigation. Recompute paths **from the linking file directory**, not repository root.
- Do not insert a Markdown link to a chapter note, Java solution or asset unless the actual target exists in the intended committed tree or is included in the same validated change set.
- Only use **verified official external LeetCode URLs**; if unverified, keep plain-text suggestions rather than false links.
- Validate syllabus chapter IDs exactly match Contents, and any Progress row uses the same stable IDs when the status tracker exists.
- In a completed chapter, verify every "Solved Practice Questions" Java link and every relative graphic link. Check that no "solved" entry is unattempted or uncommitted.
- Verify Markdown structure, tables, code-fence balance, Mermaid syntax where feasible, image accessibility/alt text and file encoding. State clearly if a renderer/Java build couldn't be run.
- For Java, test/compile using an actual compatible JDK/build setup when available; never claim tests passed if they were not run.
- Verify the new branch HEAD points to the intended commit and inspect the changed-file list after writing.

## 5. Safe updates by event

### START or PAUSE
- When tracker exists and updates are authorized, update the selected chapter status/intent without touching unrelated rows.
- Append a **concise truthful dated Daily Log checkpoint** with exact pending prompt, current approach/code state, hints used, unresolved issues and next action.
- Do not pre-create the final chapter note or publish unattempted solutions.

### SAVE SOLUTION
- Confirm the learner actually solved or deliberately requested a tutor-provided reference; classify assistance honestly.
- Publish the reviewed Java source (and tests if applicable), validate it, then record the verified path and help level in Daily Log.
- Link from completed notes or Contents **only where an existing relevant record should legitimately be updated**. If the chapter is still underway, the Daily Log can hold the temporary mapping until completion.
- Do not silently edit legacy Java files for consistency or reshape the entire repo build.

### COMPLETE CHAPTER
- Run the [completion acceptance criteria](CHAPTER_COMPLETION_WORKFLOW.md): note + visuals/assets + solved Java link table + separate optional LeetCode table + Contents + Progress (if exists) + Daily Log.
- Prepare an atomic change set when possible. If Progress is absent, do **not** claim complete status was written there; surface the prerequisite clearly.
- Publish verified links only. Ensure the chapter ID and note location remain unique, and unrelated chapter records are preserved.

### SYLLABUS / INSTRUCTION CHANGE
- Cross-check changed chapter IDs/paths in syllabus, Contents, future Progress, Daily Log and any existing notes; preserve historical evidence.
- Update the instruction index when adding/renaming instruction files. Remove stale references or leave deliberate documented migrations; no broken internal links.
- Never expand a targeted interview curriculum into broad algorithm research without the learner's explicit decision.

## 6. Commit transaction and concurrency

**Preferred:**
1. Read branch HEAD and tree SHA.
2. Build complete contents with intended file paths, plus appropriate tests/validation.
3. Create a new Git tree based on that **current** tree.
4. Create **one** commit with the current HEAD as parent.
5. Update the branch **only as a fast-forward with an expected-HEAD check** where supported (no force push).
6. Re-fetch branch HEAD, changed-file list and relevant files; confirm the outcome.

If the branch changed concurrently, do **not** force over another writer. Fetch new HEAD, re-evaluate changed files and rebuild/rebase the intended changes safely.

**Failure policy:** distinguish "content prepared", "tree created", "commit object created" and "branch actually updated". After partial failure, inspect the current branch and report exactly what exists. Repair inconsistent state only with authorization; never falsely mark a chapter complete while links are broken.

## 7. Copyright and assets

- Write original chapter explanations and diagrams. Don't reproduce copyrighted book pages, vendor screenshots or full proprietary coding question statements.
- Link to legitimate public sources and verify usage rights for copied assets. A PDF being accessible does not grant redistribution rights.
- Store original graphic assets next to their actual completed chapter only when needed; avoid large generated binary assets without concrete teaching value.
- Keep secrets, tokens, private user material and build credentials out of this public repository.

## 8. What to report after each commit

Report repository/branch, commit link, exactly which files changed, the core result, verified checks (and tests that genuinely ran), preserved existing files, and any known remaining setup prerequisites. If writes were unavailable, clearly label a draft as *not committed*.
