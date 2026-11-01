# DSA Mastery — Principal / Architect Coding Interview Syllabus

> **Curriculum version: Interview-Focused V2.** This replaces the earlier research-heavy 131-chapter plan with **36 practical chapters across 8 phases**. The goal is to build coding-interview muscle for Senior, Staff, Principal and Software Architect roles—not to study advanced algorithms as an academic research programme.

**Primary language:** Java. **Canonical chapter index:** [`ProgressTracker/CONTENTS.md`](../ProgressTracker/CONTENTS.md). **State:** All chapters in this document are *planned*; this syllabus does not claim any chapter is already completed.

## Target outcome and interview bar

By the end of the core path, the learner should be able to:

1. **Understand unfamiliar problems quickly:** clarify requirements, map constraints to complexity targets, and propose a correct baseline.
2. **Recognize and derive patterns:** choose a solution approach from underlying invariants—not memorized problem tags.
3. **Write reliable Java:** implement clean solutions with edge cases, tests, sensible data structures and correct complexity explanations.
4. **Handle interview follow-ups:** adjust the approach when the interviewer changes input scale, memory, ordering, latency or API requirements.
5. **Demonstrate retention:** re-solve representative unseen or previously studied problems independently under timed conditions.

This DSA curriculum targets the **coding and algorithmic-judgment portion** of Principal/Architect interviews. System Design, leadership, impact and architecture interviews are separate preparation tracks. Company-specific coding bars vary.

## Depth rules — prevent research-scope creep

| Level | What is expected | What is *not* required |
|---|---|---|
| **Core (Phases 0–6)** | Deep practical understanding of interview-relevant material; independent implementation of common techniques; justified complexity; several well-chosen problems per chapter | Formal academic proofs of every theorem or specialist competitive-programming tricks |
| **Interview-focused Architect (Phase 7)** | Trade-off reasoning, realistic coding/design follow-ups, scalability/performance awareness, and strong communication | Implementing full production systems or distributed infrastructure in this repository |
| **Optional depth** | Learn rare techniques only when a target role or specific problem calls for them | Mandatory suffix automata, convex-hull trick, advanced digit DP, FFT, network flow, deep formal complexity theory, research ANN, or lock-free proofs |

**Teaching preference:** intuition → visual dry run (diagrams/Mermaid when useful) → algorithmic invariant → Java code → edge-case tests → time/space analysis → interview follow-up. Full topic notes are **not** created upfront. They are prepared and committed only after the interactive lesson is finished and the learner approves completion.

**Practice preference:** actual solving over reading. Start with the learner's existing ~100-question iteration; map previous problems by topic without claiming they were all independently mastered. Add new carefully chosen unseen problems to close pattern gaps, including selected hards but no fixed problem-count quota. Existing `LinkedList/`, `Stacks/`, `Hashing/`, `RecursionAndBacktracking/`, `DSATestProject/` and the separate LeetCode repository remain intact.

**Completion ≠ mastery:** finishing a guided chapter does not establish independent problem-solving readiness. Assess independence and revisit weak patterns separately in a future progress/revision tracker. No existing completion status or rating is inferred here.

## Learning sequence

| Phase | Focus | Chapters | Expectation |
|---:|---|---:|---|
| 0 | Coding Interview Foundations | 3 | Required |
| 1 | Arrays, Strings and Essential Patterns | 6 | Highest priority |
| 2 | Linked Lists, Stacks, Queues and Data Structure Design | 4 | Required |
| 3 | Recursion, Backtracking, Searching and Sorting | 4 | Required |
| 4 | Trees, BSTs, Heaps and Tries | 5 | Required |
| 5 | Graph Algorithms | 5 | Required |
| 6 | Greedy Algorithms and Dynamic Programming | 5 | Required |
| 7 | Applied DSA and Principal-Level Coding Judgment | 4 | Targeted - Interview focus |
| **Total** | **Coding interviews + applied judgment** | **36** | **Interview-first** |

Practice, independent retries, mixed sets and revision run **throughout all phases**. You do not need to finish the syllabus before beginning LeetCode or mock interview practice.

## Chapter-by-chapter curriculum

## Phase 0 — Coding Interview Foundations

**Priority:** Required. **Prerequisites:** Basic Java syntax and ability to write small programs.
**Phase goal:** Build fast, correct, clearly explained Java solutions.

### Algorithmic Thinking and Complexity (DSA-0.01)

- **Learn and practice:** Read constraints and derive brute-force vs optimized strategies; Big-O time/space; best/worst case; recursion cost intuition; amortized O(1) intuition; input-size budgets.
- **Representative problems (suggestions, not a completion checklist):** Two Sum: O(n²) vs map-based O(n); justify why a two-pointer scan is O(n) despite nested-looking movement.
- **Chapter interview-readiness checkpoint:** Given an unfamiliar easy/medium question, articulate a correctness-first baseline, bound its cost and choose a justified improvement.
- **Principal/Architect follow-up:** Defend time vs memory trade-off when input size or memory budget changes.

### Java for DSA Interviews (DSA-0.02)

- **Learn and practice:** Arrays, List/ArrayList, HashMap/HashSet, TreeMap/TreeSet, ArrayDeque, PriorityQueue, StringBuilder; sorting/comparators; generics; equals/hashCode; primitives vs boxing; overflow and mutable-key pitfalls.
- **Representative problems (suggestions, not a completion checklist):** Implement frequency counting, heap ordering and a linked-node helper using standard Java APIs.
- **Chapter interview-readiness checkpoint:** Write idiomatic Java without repeatedly checking basic API syntax; explain operation costs and collection choice.
- **Principal/Architect follow-up:** Compare allocations, iteration order, thread-safety expectations and memory overhead without digging into JVM research internals.

### Correctness, Testing and Interview Coding (DSA-0.03)

- **Learn and practice:** Clarify contracts and examples; state a simple invariant; dry runs; null/empty/duplicate/negative/large inputs; boundary and overflow checks; deterministic unit tests; communication under time pressure.
- **Representative problems (suggestions, not a completion checklist):** Write a test matrix, build a small independent baseline, review failing cases, and explain a solution aloud.
- **Chapter interview-readiness checkpoint:** Produce clean, runnable, testable Java with input assumptions, complexity and essential corner cases explained.
- **Principal/Architect follow-up:** Discuss maintainability, failure cases and API behavior when an interviewer changes constraints.

**Phase exit gate:** Show the phase goal through independent problems, correct Java solutions, clear complexity explanations and appropriate follow-up reasoning; a fixed problem count is not sufficient evidence by itself.

## Phase 1 — Arrays, Strings and Essential Patterns

**Priority:** Highest priority. **Prerequisites:** Phase 0 and basic Java collections.
**Phase goal:** Recognize high-frequency patterns without depending on problem tags.

### Arrays, Strings and Hashing (DSA-1.01)

- **Learn and practice:** Array/string traversals, indexing and in-place mutation; frequency maps; sets; complementary values; duplicate handling; sorting-vs-hashing choice; anagram grouping; string building.
- **Representative problems (suggestions, not a completion checklist):** Two Sum, Group Anagrams, Valid Anagram and frequency-based grouping.
- **Chapter interview-readiness checkpoint:** Independently choose arrays, sets, maps or sorting based on constraints; code edge-case-safe solutions.
- **Principal/Architect follow-up:** Explain Unicode, allocation and unordered-vs-ordered output requirements when relevant.

### Two Pointers (DSA-1.02)

- **Learn and practice:** Opposite ends and same direction; sorted pair search; palindrome checks; removing duplicates; partitioning and in-place transformations; correct pointer movement invariants.
- **Representative problems (suggestions, not a completion checklist):** Container With Most Water, 3Sum, Move Zeroes, palindrome checking.
- **Chapter interview-readiness checkpoint:** Derive why pointer movement is safe; avoid lost cases with duplicates, negatives and boundaries.
- **Principal/Architect follow-up:** Choose in-place vs auxiliary-memory implementations according to API and memory constraints.

### Sliding Window (DSA-1.03)

- **Learn and practice:** Fixed and variable windows; running sums, frequency counts and distinct-element constraints; longest/shortest windows; validity and shrink/expand invariants.
- **Representative problems (suggestions, not a completion checklist):** Longest Substring Without Repeating Characters, Minimum Window Substring, fixed-size maximum average.
- **Chapter interview-readiness checkpoint:** Identify when a sliding-window invariant works and when negative values or non-monotone constraints invalidate it.
- **Principal/Architect follow-up:** Defend memory vs speed and streaming feasibility for large input sequences.

### Prefix Sums and Subarray Problems (DSA-1.04)

- **Learn and practice:** 1D/2D prefix sums; range queries; subarray-sum counting with HashMap; prefix parity/modulo intuition; difference-array range updates as a useful extension.
- **Representative problems (suggestions, not a completion checklist):** Subarray Sum Equals K, Range Sum Query, Product of Array Except Self (prefix/suffix).
- **Chapter interview-readiness checkpoint:** Handle negative numbers and count initialization correctly; derive O(n) or O(n+q) solutions.
- **Principal/Architect follow-up:** Compare preprocessing vs query-time trade-offs for repeated queries.

### Binary Search (DSA-1.05)

- **Learn and practice:** Sorted search; lower/upper bound; first/last occurrence; rotated sorted arrays; peak/monotone predicates; binary search on an answer.
- **Representative problems (suggestions, not a completion checklist):** Search in Rotated Sorted Array, Find First and Last Position, Koko Eating Bananas.
- **Chapter interview-readiness checkpoint:** Prove the monotonic condition and maintain correct inclusive/exclusive bounds, using overflow-safe midpoint.
- **Principal/Architect follow-up:** Justify binary search vs scan or indexing for different query/update workloads.

### Intervals and Matrix Patterns (DSA-1.06)

- **Learn and practice:** Sorting/merging intervals; insert interval; meeting rooms; sweep/event ordering basics and endpoint conventions; matrix traversal, transpose/rotate and coordinate bounds.
- **Representative problems (suggestions, not a completion checklist):** Merge Intervals, Meeting Rooms, Rotate Image, Spiral Matrix.
- **Chapter interview-readiness checkpoint:** Solve overlap and traversal problems without off-by-one errors and explain ordering assumptions.
- **Principal/Architect follow-up:** Discuss memory needed for large grids and streaming vs full-materialization for interval datasets.

**Phase exit gate:** Show the phase goal through independent problems, correct Java solutions, clear complexity explanations and appropriate follow-up reasoning; a fixed problem count is not sufficient evidence by itself.

## Phase 2 — Linked Lists, Stacks, Queues and Data Structure Design

**Priority:** Required. **Prerequisites:** Phases 0–1; basic reference semantics and hashes.
**Phase goal:** Become fluent with pointers, operation invariants and common coding-design questions.

### Linked Lists and Pointer Patterns (DSA-2.01)

- **Learn and practice:** Singly, doubly and circular lists; insertion/deletion; reversal; dummy nodes; fast/slow pointers; cycle entry; merge, reorder, palindrome and random-pointer cloning.
- **Representative problems (suggestions, not a completion checklist):** Reverse Linked List, Reorder List, Linked List Cycle II, Copy List with Random Pointer.
- **Chapter interview-readiness checkpoint:** Draw pointer changes, preserve links and handle null, singleton and even/odd-length lists independently.
- **Principal/Architect follow-up:** Compare node allocations, random access and iteration costs to arrays; reuse existing legacy Java implementations as reference only.

### Stacks, Queues and Deques (DSA-2.02)

- **Learn and practice:** LIFO/FIFO operations; array-backed and linked representations; Java ArrayDeque; valid parentheses; expression evaluation; queue using stacks; circular queue fundamentals.
- **Representative problems (suggestions, not a completion checklist):** Valid Parentheses, Implement Queue Using Stacks, Evaluate Reverse Polish Notation.
- **Chapter interview-readiness checkpoint:** Choose stack vs queue vs deque and implement core operations and problem solutions with correct empty-state behavior.
- **Principal/Architect follow-up:** Discuss bounded queues, stack memory and API contracts without mandatory concurrent-queue internals.

### Monotonic Stacks and Queues (DSA-2.03)

- **Learn and practice:** Next greater/smaller; span and histogram; monotonic deque for sliding-window extrema; indices vs values; duplicates and amortized linear complexity.
- **Representative problems (suggestions, not a completion checklist):** Daily Temperatures, Largest Rectangle in Histogram, Sliding Window Maximum.
- **Chapter interview-readiness checkpoint:** Derive push/pop invariants and explain why operations remain O(n).
- **Principal/Architect follow-up:** Compare algorithm with brute force and discuss tie rules and memory costs.

### Composite Data Structure Problems (DSA-2.04)

- **Learn and practice:** Min Stack; LRU with map + doubly linked list; LFU with frequency bookkeeping; set of stacks; design O(1) operations where achievable.
- **Representative problems (suggestions, not a completion checklist):** Min Stack, LRU Cache, LFU Cache, Set of Stacks.
- **Chapter interview-readiness checkpoint:** Implement at least LRU and Min Stack independently; explain LFU edge cases and O(1) goals.
- **Principal/Architect follow-up:** Respond to thread safety, expiration, memory budget and performance follow-ups; no full distributed cache project.

**Phase exit gate:** Show the phase goal through independent problems, correct Java solutions, clear complexity explanations and appropriate follow-up reasoning; a fixed problem count is not sufficient evidence by itself.

## Phase 3 — Recursion, Backtracking, Searching and Sorting

**Priority:** Required. **Prerequisites:** Phases 0–2.
**Phase goal:** Write search algorithms with controlled state and reason about practical sorting.

### Recursion and Divide and Conquer (DSA-3.01)

- **Learn and practice:** Call stack and base cases; recursive state; recurrence intuition; merge-based decomposition; recursive vs iterative solutions; output-size costs.
- **Representative problems (suggestions, not a completion checklist):** Tower of Hanoi for explanation; Merge Sort; recursion-based list/tree helper.
- **Chapter interview-readiness checkpoint:** Trace calls and return values; avoid stack overflow and missing base cases.
- **Principal/Architect follow-up:** Explain recursion depth, allocation overhead and when iteration is safer.

### Backtracking (DSA-3.02)

- **Learn and practice:** Choose–explore–undo; decision trees; subsets, permutations, combinations, combination sum, word search; pruning and duplicate handling.
- **Representative problems (suggestions, not a completion checklist):** Subsets, Permutations, Combination Sum, Word Search.
- **Chapter interview-readiness checkpoint:** Model state cleanly and distinguish pruning that is safe from pruning that loses valid answers.
- **Principal/Architect follow-up:** Discuss branching factor, worst-case explosion and using constraints to prune.

### Sorting, Partitioning and Selection (DSA-3.03)

- **Learn and practice:** Insertion/merge/quick/heap sort mechanisms; stable vs unstable; in-place vs auxiliary memory; partitioning; quickselect and K-th element; choosing library sort.
- **Representative problems (suggestions, not a completion checklist):** Sort Colors, Kth Largest Element in an Array, Merge Sort implementation.
- **Chapter interview-readiness checkpoint:** Know complexity and important trade-offs; implement merge sort and quicksort/partition logic; select a suitable strategy.
- **Principal/Architect follow-up:** Compare expected/worst cases, allocation and whether a full sort is needed for Top-K.

### Bit Manipulation and Essential Math (DSA-3.04)

- **Learn and practice:** AND/OR/XOR/NOT, shifting, masks, set/test/clear bits; single-number patterns; GCD/LCM; modular arithmetic basics; basic combinatorial counting.
- **Representative problems (suggestions, not a completion checklist):** Single Number, Counting Bits, missing-number/XOR, GCD.
- **Chapter interview-readiness checkpoint:** Apply bitwise reasoning and avoid Java signed-shift/overflow traps.
- **Principal/Architect follow-up:** Discuss compact bitsets and integer boundary limits; no advanced number theory proofs.

**Phase exit gate:** Show the phase goal through independent problems, correct Java solutions, clear complexity explanations and appropriate follow-up reasoning; a fixed problem count is not sufficient evidence by itself.

## Phase 4 — Trees, BSTs, Heaps and Tries

**Priority:** Required. **Prerequisites:** Recursion, stacks/queues and ordered comparisons.
**Phase goal:** Build strong tree traversal and hierarchical data-structure problem-solving skills.

### Binary Trees and Traversals (DSA-4.01)

- **Learn and practice:** Node/height/depth concepts; recursive and iterative DFS; BFS/level order; preorder/inorder/postorder; balanced vs skewed shapes.
- **Representative problems (suggestions, not a completion checklist):** Binary Tree Level Order Traversal, Invert Binary Tree, iterative inorder.
- **Chapter interview-readiness checkpoint:** Implement traversal variants and reason about O(n) time and recursion/queue space.
- **Principal/Architect follow-up:** Compare recursion vs iterative implementations on deep trees.

### Tree Problem-Solving Patterns (DSA-4.02)

- **Learn and practice:** Height, max depth, diameter, path sums, subtree state, lowest common ancestor, symmetry, balanced checks, serialize/deserialize.
- **Representative problems (suggestions, not a completion checklist):** Diameter of Binary Tree, Lowest Common Ancestor, Serialize and Deserialize Binary Tree.
- **Chapter interview-readiness checkpoint:** Derive recursive return contracts, handle null nodes and explain parent/child invariants.
- **Principal/Architect follow-up:** Discuss serialization format and O(n) memory costs for very large trees.

### Binary Search Trees and Ordered Data (DSA-4.03)

- **Learn and practice:** BST invariant; search/insert/delete; validation; k-th smallest; iterator; ordered traversal and successor; intuition for AVL/Red-Black balancing.
- **Representative problems (suggestions, not a completion checklist):** Validate Binary Search Tree, Kth Smallest in BST, BST Iterator.
- **Chapter interview-readiness checkpoint:** Implement standard BST ops or solve BST problems; know degeneration and balanced-height benefits.
- **Principal/Architect follow-up:** Choose TreeMap/TreeSet vs HashMap/HashSet based on ordered/range queries.

### Heaps and Priority Queues (DSA-4.04)

- **Learn and practice:** Min/max heaps; array layout, heapify, push/pop; Java PriorityQueue; Top-K, merge K lists, running median, scheduling.
- **Representative problems (suggestions, not a completion checklist):** Top K Frequent Elements, Merge K Sorted Lists, Find Median from Data Stream.
- **Chapter interview-readiness checkpoint:** Use heaps confidently and explain O(log n), O(n) heapify, and O(n log k) top-K trade-offs.
- **Principal/Architect follow-up:** Choose heap vs sorting vs ordered set based on updates, ties and memory.

### Tries and Prefix Search (DSA-4.05)

- **Learn and practice:** Trie node/edge representation; insert/search/prefix; word dictionary with wildcard; prefix counts; pruning and memory footprint.
- **Representative problems (suggestions, not a completion checklist):** Implement Trie, Design Add and Search Words Data Structure, Word Search II as stretch.
- **Chapter interview-readiness checkpoint:** Implement a simple Trie independently; explain prefix lookup and recursion/state.
- **Principal/Architect follow-up:** Compare Trie with HashMap for autocomplete, update patterns and memory.

**Phase exit gate:** Show the phase goal through independent problems, correct Java solutions, clear complexity explanations and appropriate follow-up reasoning; a fixed problem count is not sufficient evidence by itself.

## Phase 5 — Graph Algorithms

**Priority:** Required. **Prerequisites:** Trees, recursion, queues, heaps, hashing.
**Phase goal:** Model graph problems and confidently implement common traversals, ordering and shortest paths.

### Graph Representation, BFS and DFS (DSA-5.01)

- **Learn and practice:** Directed/undirected graphs; adjacency lists vs matrices; visited states; components; BFS levels; DFS cycle detection.
- **Representative problems (suggestions, not a completion checklist):** Clone Graph, Number of Connected Components, Graph Valid Tree.
- **Chapter interview-readiness checkpoint:** Build correct graph representation and traverse in O(V+E), distinguishing directed from undirected cycle logic.
- **Principal/Architect follow-up:** Choose memory representation and iterative traversal for large sparse graphs.

### Grid and Implicit Graph Problems (DSA-5.02)

- **Learn and practice:** Grid as a graph; 4/8 neighbors; DFS/BFS flood-fill; islands; shortest unweighted path; multi-source BFS and visited strategies.
- **Representative problems (suggestions, not a completion checklist):** Number of Islands, Rotting Oranges, Shortest Path in Binary Matrix.
- **Chapter interview-readiness checkpoint:** Solve grid traversal and multi-source problems, avoiding coordinate and mutation bugs.
- **Principal/Architect follow-up:** Discuss visited memory vs mutating input and handling large state spaces.

### Directed Graphs and Topological Sort (DSA-5.03)

- **Learn and practice:** DAG structure; DFS colors; Kahn's in-degree algorithm; cycle detection; dependency and course scheduling.
- **Representative problems (suggestions, not a completion checklist):** Course Schedule I/II, Alien Dictionary as stretch.
- **Chapter interview-readiness checkpoint:** Implement topological sorting and report impossible ordering due to cycle.
- **Principal/Architect follow-up:** Relate to build/deployment dependencies, partial order and parallel task readiness.

### Union-Find and Minimum Spanning Trees (DSA-5.04)

- **Learn and practice:** Disjoint Set Union, path compression/union by rank; graph connectivity; Kruskal and Prim basics; MST intuition.
- **Representative problems (suggestions, not a completion checklist):** Number of Provinces, Accounts Merge, Min Cost to Connect All Points as stretch.
- **Chapter interview-readiness checkpoint:** Implement DSU and apply Kruskal to a moderate weighted-graph problem; understand Prim at interview level.
- **Principal/Architect follow-up:** Discuss dynamic connectivity vs repeated traversal and the MST vs shortest-path distinction.

### Shortest Path Algorithms (DSA-5.05)

- **Learn and practice:** Dijkstra with heap, relaxation and nonnegative weights; unweighted BFS vs weighted paths; Bellman-Ford negative-edge intuition; A* high-level.
- **Representative problems (suggestions, not a completion checklist):** Network Delay Time, Cheapest Flights Within K Stops, weighted shortest-path variant.
- **Chapter interview-readiness checkpoint:** Independently code Dijkstra, state its assumptions and choose BFS/Bellman-Ford where appropriate.
- **Principal/Architect follow-up:** Justify route-planning algorithm when edge weights, graph size or heuristic availability changes.

**Phase exit gate:** Show the phase goal through independent problems, correct Java solutions, clear complexity explanations and appropriate follow-up reasoning; a fixed problem count is not sufficient evidence by itself.

## Phase 6 — Greedy Algorithms and Dynamic Programming

**Priority:** Required. **Prerequisites:** Recursion, arrays, sorting and graphs.
**Phase goal:** Recognize optimization structure, derive DP states and solve common medium-plus problems.

### Greedy Algorithms (DSA-6.01)

- **Learn and practice:** Greedy choice intuition; sort-and-scan; intervals/scheduling; jump game; heap-based greedy; counterexamples when local optimum fails.
- **Representative problems (suggestions, not a completion checklist):** Jump Game, Non-overlapping Intervals, Task Scheduler.
- **Chapter interview-readiness checkpoint:** Explain why a greedy choice is safe using a practical invariant or concise exchange argument.
- **Principal/Architect follow-up:** Compare greedy and DP where constraints/objective changes invalidate greedy.

### Dynamic Programming Fundamentals (DSA-6.02)

- **Learn and practice:** Overlapping subproblems; optimal substructure; recursion to memoization to tabulation; state, transition, base cases; memory optimization.
- **Representative problems (suggestions, not a completion checklist):** Climbing Stairs, House Robber, decode-ways-like state practice.
- **Chapter interview-readiness checkpoint:** Derive and implement a recurrence without copying a memorized formula.
- **Principal/Architect follow-up:** Defend state dimension and time/space cost; explicitly handle impossible states.

### One-Dimensional and Grid DP (DSA-6.03)

- **Learn and practice:** 1D transitions; stock variants; robber; min-cost stairs; grid paths and minimum path sum; rolling arrays.
- **Representative problems (suggestions, not a completion checklist):** House Robber II, Unique Paths, Minimum Path Sum.
- **Chapter interview-readiness checkpoint:** Solve and explain tabulation order, boundary conditions and state compression.
- **Principal/Architect follow-up:** Discuss streaming row-by-row memory optimization and reconstruction trade-offs.

### Knapsack and Counting DP (DSA-6.04)

- **Learn and practice:** 0/1 and unbounded knapsack intuition; subset sum; coin change; target sum; count vs min/max objective; update-order correctness.
- **Representative problems (suggestions, not a completion checklist):** Coin Change, Partition Equal Subset Sum, Coin Change II, Target Sum.
- **Chapter interview-readiness checkpoint:** Set up state and valid transition direction; distinguish count/feasibility/optimization.
- **Principal/Architect follow-up:** Explain pseudopolynomial complexity intuition and memory trade-offs.

### Sequence and Selected Advanced DP (DSA-6.05)

- **Learn and practice:** Longest common subsequence, longest increasing subsequence, edit distance; partition and interval DP basics as stretch; selected tree DP as stretch.
- **Representative problems (suggestions, not a completion checklist):** Longest Common Subsequence, Longest Increasing Subsequence, Edit Distance.
- **Chapter interview-readiness checkpoint:** Implement LCS/LIS and explain state transitions; choose a few stretch harder variants based on interview needs.
- **Principal/Architect follow-up:** Discuss reconstruction and O(n²) vs O(n log n) methods for LIS; no contest-grade optimizations.

**Phase exit gate:** Show the phase goal through independent problems, correct Java solutions, clear complexity explanations and appropriate follow-up reasoning; a fixed problem count is not sufficient evidence by itself.

## Phase 7 — Applied DSA and Principal-Level Coding Judgment

**Priority:** Targeted - Interview focus. **Prerequisites:** Core Phases 0–6; can be interleaved during later interview preparation.
**Phase goal:** Use algorithmic skills in realistic design/coding interviews, without drifting into algorithm research.

### Advanced Data Structure Design (DSA-7.01)

- **Learn and practice:** Custom collection/iterator; cache APIs and O(1) invariants; min/max stack design; scheduler primitives; testability and contract changes.
- **Representative problems (suggestions, not a completion checklist):** Design LRU/LFU variant, implement iterator with constraints, adapt a scheduler API.
- **Chapter interview-readiness checkpoint:** Build clean Java solution to a realistic design-coding problem and demonstrate edge-case tests.
- **Principal/Architect follow-up:** Discuss alternative APIs, invalidation, maintainability and thread-safety caveats—not distributed systems implementation.

### Choosing Data Structures for Real Workloads (DSA-7.02)

- **Learn and practice:** HashMap vs TreeMap; heap vs sorted list/set; arrays vs lists; indexing and memory locality basics; ordered/range queries; latency/space trade-offs.
- **Representative problems (suggestions, not a completion checklist):** Choose an implementation for Top-K updates, ordered lookup, or high-volume insert/read mix.
- **Chapter interview-readiness checkpoint:** Explain algorithm choice using measured or estimated operation counts and workload assumptions.
- **Principal/Architect follow-up:** Handle interviewer changes to read/write ratio, memory budget and ordering requirements.

### Streaming and Large-Data Patterns (DSA-7.03)

- **Learn and practice:** Streaming Top-K with heap; fixed-memory sampling (reservoir); approximate membership/counting motivation; pagination and bounded-memory processing.
- **Representative problems (suggestions, not a completion checklist):** Find Top K from a large stream; reservoir sampling; Bloom filter conceptual exercise.
- **Chapter interview-readiness checkpoint:** Implement heap Top-K and reservoir sampling; explain when exact counting becomes too expensive.
- **Principal/Architect follow-up:** Discuss approximation errors conceptually; HyperLogLog/Count-Min/Bloom filters remain optional context, not research implementation.

### Principal-Level Coding Challenges (DSA-7.04)

- **Learn and practice:** Mixed-pattern unseen mediums and selected hards; timed coding, code review and requirement changes; complexity, maintainability and failure analysis.
- **Representative problems (suggestions, not a completion checklist):** Timed mixed-set: graph + heap, cache extension, tree serialization, streaming Top-K; selected hard follow-ups.
- **Chapter interview-readiness checkpoint:** Independently solve and explain under interview conditions with clear communication and working tests.
- **Principal/Architect follow-up:** Respond to changed constraints: scale, memory, concurrent clients, incremental updates or latency targets.

**Phase exit gate:** Show the phase goal through independent problems, correct Java solutions, clear complexity explanations and appropriate follow-up reasoning; a fixed problem count is not sufficient evidence by itself.

## Continuous practice and revision (not additional chapters)

Run these alongside the chapter sequence:

- **Learning round:** start each new pattern with an understandable example; articulate a brute-force baseline, derive optimization, and solve with graduated hints only when needed.
- **Independent round:** solve related *unseen* problems without pattern labels; write and test code before reviewing solutions.
- **Interview round:** timed medium problems and selected hard follow-ups; verbalize trade-offs, adjust to new requirements, and review code quality.
- **Retention round:** scheduled re-solves; track mistakes (wrong pattern, missed invariant, edge case, Java API, complexity, implementation bug) and prioritize weak patterns.
- **Practice artifacts:** commit actual completed practice code in `PracticeCodes/` when ready, or link verified solutions from the existing LeetCode repository. Avoid duplicate canonical copies.
- **Chapter artifacts:** only after learner approval, create lesson notes under `Notes/` with diagrams/dry runs, conceptual explanation, invariants, complexity, mistakes, revision prompts and links to real code. Update `ProgressTracker/CONTENTS.md` with *actual* links.

## Interview-oriented milestones

- **Foundation checkpoint (after Phases 0–2):** solve representative array/string, binary search, sliding-window, linked-list, stack and cache-design questions without following a solution template.
- **Algorithm checkpoint (after Phases 3–5):** demonstrate recursive/backtracking fluency; solve unfamiliar tree, heap and graph traversal questions; implement DFS/BFS, topological sort and Dijkstra where appropriate.
- **Optimization checkpoint (after Phase 6):** independently define DP state/transitions and explain a greedy choice on medium-level questions, with some harder variants.
- **Principal/Architect checkpoint (Phase 7):** complete realistic mixed-pattern timed interviews, code reviews and changing-requirements questions; justify data-structure choices under performance/memory constraints.

## Explicit optional shelf (not part of 36-chapter completion)

Advanced proof techniques, NP-completeness reductions, heavy approximation theory, max-flow variants, advanced DP optimization, suffix trees/automata, FFT, specialized geometry, full B+ tree or LSM internals, deep concurrency algorithms and specialized ANN research are **not mandatory**. They may be consulted selectively for target-company needs or production projects; the System Design repository handles the broader architecture context.

## Governance and cross-links

- `Curriculum/SYLLABUS.md` is the canonical scope and chapter description; [`ProgressTracker/CONTENTS.md`](../ProgressTracker/CONTENTS.md) is the ordered navigation index.
- IDs `DSA-0.01` through `DSA-7.04` are for curriculum linkage, **not proof of progress**. This V2 intentionally supersedes old 131-chapter IDs; no completed notes or progress records were migrated because the earlier files only represented planned topics.
- The future `ProgressTracker/PROGRESS.md` and `DAILY_LOG.md` should record actual learner-confirmed work. Existing Java code must not be reclassified as a completed chapter without discussion.
- No lesson notes or unworked practice solutions are created by this curriculum revision. Verify cross-file consistency for future syllabus edits.
