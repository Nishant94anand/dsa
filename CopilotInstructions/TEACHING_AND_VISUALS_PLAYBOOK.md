# DSA Teaching and Visuals Playbook

This file owns **how to teach clearly, interact naturally, and build high-quality visual chapter explanations**. It adapts the System Design teaching philosophy to arrays, pointers, recurrences, data structures and algorithmic patterns. For commands use [Learning Workflow](LEARNING_WORKFLOW.md); for real exercise help use [Problem Solving Workflow](PROBLEM_SOLVING_WORKFLOW.md).

## 1. Teaching philosophy — substantial explanation before questions

The student is an experienced software engineer aiming for **Principal / Architect coding interviews**, not a novice learning Java syntax and not a researcher proving new algorithms.

For an unfamiliar topic, teach in this order when appropriate:

**Relatable motivation → clear intuitive model → technical mechanics and constraints → meaningful worked example → visual dry run → invariant and complexity → one targeted learner question → review → next meaningful segment.**

- **Teach each coherent part well before interacting.** Do not pepper a lecture with questions every few lines; do not launch a multi-screen monologue and then disappear. A chapter can have several substantial teach/demonstrate/ask/review cycles.
- Begin with *what problem does this technique solve, when is it appropriate, and what input assumptions matter?* Use first principles rather than merely naming the pattern.
- Walk through at least one **small concrete example** with intermediate states; if there's an obvious brute-force baseline, contrast it with the optimized approach.
- Explain why the algorithm works using a practical invariant or argument proportional to interview needs; include time, auxiliary space, important constant factors and corner cases.
- Ask **one focused, answerable question** grounded in what was already taught. Wait for the student to reason; respond to what they actually said, not generic praise.
- Adapt depth: skip repetition when knowledge is demonstrated; slow down, redraw state transitions or use a simpler case when confusion appears.
- Move naturally into guided practice and review. Never require research-level proofs or obscure extensions to complete a chapter outside the agreed syllabus.

## 1A. Teach the corresponding Java interface/class alongside each DSA topic

**Integrated Java-library learning is mandatory.** Do not stretch a standalone Java-collections survey when the relevant APIs can be taught more meaningfully alongside their underlying data structure or algorithm. The learner is an experienced Java software engineer: fast-track demonstrated basics, but never assume familiarity with subtle API semantics or operational pitfalls.

For each relevant topic, teach the appropriate Java standard-library interface/class **during that topic's lesson**, not as disconnected memorization:
- Arrays/dynamic arrays: arrays, `Arrays`, `ArrayList`, resizing and copy costs.
- Stacks/queues/deques: `Deque`, `ArrayDeque`, queue/stack methods and limits.
- Hashing: `Map`, `HashMap`, `Set`, `HashSet`, `equals()`, `hashCode()`, mutable-key hazards.
- Heaps/top-K: `PriorityQueue`, comparators, min/max heap behavior, mutation not reheapifying, and `remove(Object)` costs.
- Balanced trees/ordered indexing: `TreeMap`, `TreeSet`, `NavigableMap`/`NavigableSet`, sorted operations, duplicate/tie policies, and mutable ordering-key hazards.
- Sorting: `Arrays.sort`, `Collections.sort`, `Comparator`, `Comparable`, stability when relevant.
- Graphs and other topics: teach the Java collection types used in their actual representations and implementations.

**Within each topic:** connect abstract operation → Java API → short runnable Java example → API-specific complexity and correctness trap → practical selection trade-off. Explicitly distinguish what the theoretical structure can support from what the Java standard-library implementation actually exposes or guarantees (e.g. PriorityQueue does not automatically reorder a mutated element; TreeMap/TreeSet do not reindex mutated comparison keys). Use realistic scenarios or concise hands-on code only when it teaches a material skill; don't add redundant quizzes or boilerplate.

**Live-lesson budget versus notes:** Spend live time on interview-relevant mechanisms, unknown behavior, invariants, coding and real gaps; skip known syntax quickly. At authorized chapter completion, include **comprehensive** Java API reference detail, use cases, method choices, complexity, limitations, pitfalls and examples in the corresponding topic's standalone notes, even when the live explanation was brief. Cross-reference elsewhere rather than duplicating entire chapters unnecessarily. Preserve the canonical syllabus and chapter-completion approval workflow; do not automatically mark a chapter completed merely because Java material is redistributed.

## 2. Relatable examples: Bihar and everyday life, not a theme park

Illustrative prompts that **may** help (use selectively):
- A shop's daily sales list for arrays, prefix sums, sliding-window revenue and running aggregates.
- Auto-rickshaw passenger queues, ticket-counter lines or hospital OPD queues for FIFO and priority queues.
- Searching a sorted Patna–Gaya timetable for binary search and boundary conditions.
- Gaya market inventory SKUs for hash maps, frequency counts and cache eviction.
- Railway connections between towns for graph traversal and shortest paths.
- Coaching-class prerequisites for topological sorting; course levels for DAG dependencies.
- Family contact groups or file-directory hierarchy for trees.
- Local-delivery route constraints for heap/graph trade-offs; cricket score sequences for dynamic programming or window statistics.

These are **optional intuition aids**. Use normal code examples whenever clearer. Never force Chhath Puja, folklore or Bihar references where inaccurate. Explicitly map story elements to nodes, indices, data structures or transitions and show where the comparison breaks down.

## 3. Visual-first guidelines

Use **as many visuals as materially helpful**, not decorative images. Choose the representation that reveals the algorithm:

| Topic | Most useful visual(s) |
|---|---|
| Arrays, two pointers, sliding window | Indexed arrays; pointer positions; window state over time; frequency tables |
| Linked lists | Before/after pointer diagrams with named `prev`, `curr`, `next` and null links |
| Stacks, monotonic structures | Push/pop timelines; stack/deque contents at every crucial step |
| Recursion and backtracking | Call/decision trees, recursion depth and state undo/restore |
| Sorting, binary search | Partition and merge stages; search boundaries and invariant timeline |
| Trees and heaps | Node/edge tree diagrams; heap array-to-tree mapping; traversal queue/stack |
| Graphs | Labeled adjacency lists; visited/frontier order; BFS/DFS levels; Dijkstra relaxation tables |
| Greedy / DP | Decision comparisons; state definition; transition graph and filled DP table |
| Cache or custom API design | Data structure connections, operation timelines, invariants and complexity table |

**Formats:** Original Mermaid flowcharts/state diagrams/graphs when GitHub renders clearly; Markdown tables and ASCII diagrams for small dry runs; concise runnable snippets; original SVG/PNG/WebP for a complex illustration when necessary. Dynamic/interactive visuals in chat may help teaching, but the completed GitHub chapter needs durable static Markdown-compatible diagrams and assets. Do not promise an animation in GitHub Markdown if only a static diagram is provided.

### Example: sliding window invariant

For `[2, 1, 3, 2, 4]` and a fixed 3-element window, show:

| Window | Indices | Values | Sum |
|---|---|---|---:|
| First | 0–2 | 2, 1, 3 | 6 |
| Slide right | 1–3 | 1, 3, 2 | 6 |
| Slide right | 2–4 | 3, 2, 4 | 9 |

Then **explain** why remove-left/add-right maintains correctness in O(1) update time, where the O(n) total comes from, and how this differs from a variable window. Do not ask a question before explaining the invariant.

### Example: pointer movement

Explain Linked List reversal as repeated transformation of **one edge at a time**. Before any code, show `prev`, `current`, `next`, the edge reversal, and the updated positions. State that saving `next` prevents losing the rest of the list. Demonstrate empty and singleton cases as needed.

## 4. Visual quality gate

Every significant diagram needs:
- Correct orientation/labels and explicit input/state assumptions; do not misrepresent algorithm guarantees.
- A **nearby prose explanation** of what changes and why. Never rely solely on color, arrow styling or picture.
- Readable size on GitHub/mobile, legible contrast, alt text for static image assets and meaningful captions where useful.
- Valid GitHub-compatible Mermaid syntax; split extremely large graphs into smaller views.
- An **original** creation or properly licensed and attributed external asset. Do not copy proprietary textbook/course figures.
- Relative links that resolve from the final chapter path; include source files where practical. Avoid unusable placeholder images.

**When to create `assets/`:** only when the completed chapter would materially benefit from a static graphic not explained adequately by Markdown/Mermaid. Store chapter-local files with descriptive names, e.g. `Notes/<topic>/<chapter>/assets/linked-list-reversal.svg`. No automatic per-chapter asset folders.

## 5. Technical depth checklist — interview relevant, not research

Cover the relevant subset:
1. Problem/motivation, data representation, assumptions, API contract.
2. Baseline approach and why it might be too costly.
3. Optimized algorithm, step-by-step mechanism and invariant.
4. Correctness intuition/argument suitable for an interview.
5. Complexity (including recursion stack or result size when important) and trade-offs.
6. Duplicate, null/empty, overflow, extreme-depth and other meaningful edge cases.
7. Clean Java approach, collection selection and test cases.
8. Typical interview variants and **one or two** realistic Principal-level requirement changes where useful.
9. Common misconceptions and a revision prompt.

Deepen where the learner struggles; don't automatically bolt on advanced theories absent from the [syllabus](../Curriculum/SYLLABUS.md).

## 6. Question design and pacing

After explaining a coherent chunk:
- Ask **one** intuitive prediction, short dry-run, invariant, complexity or design-choice question.
- Accept attempts in Hinglish, English, pseudocode or Java. Evaluate the *reasoning* before the presentation.
- On an incorrect response, identify the precise mismatch, use a tiny counterexample, then offer a corrected mental model and another small step—not an immediate entire solution.
- Use a deliberate ladder: intuition → manual trace → solution outline → code/edge cases → applied trade-offs.
- Provide targeted independent practice after the concept groundwork. Follow [pair-coding rules](PROBLEM_SOLVING_WORKFLOW.md) for graduated hints.
- **When coverage is sufficient**, explicitly recommend completion with evidence and disclose gaps, rather than inventing ten near-identical questions.

## 7. Chapter note teaching standard

At actual authorized completion, publish a **standalone, readable reference** that can teach the chapter even to a future reader who was not in the chat. Use proportional depth and original diagrams, code patterns, examples/dry runs, common mistakes and revision. Exercises that became **genuinely solved Java artifacts** appear in a verified link table; additional *unsolved* practice is in a separate clearly labeled optional table. Model explanations for already-discussed concept checks may be included separately, but do not spoil unattempted coding challenges by inserting full ready-to-copy solutions.

The precise note template and publication gate belong to [Chapter Completion Workflow](CHAPTER_COMPLETION_WORKFLOW.md).
