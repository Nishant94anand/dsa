# DSA Mastery — Canonical Chapter-Wise Syllabus

> **Status:** Curriculum plan only. A chapter listed here is **not** a completed lesson, an existing note, or evidence of mastery. Completed notes are created under `Notes/` only after interactive learning and learner confirmation.

**Primary language:** Java. **Audience:** Senior → Staff → Principal Engineer / Software Architect. **Purpose:** rigorous DSA understanding, independent problem solving, algorithm engineering and architecture-level trade-off judgment.

## How to read this syllabus

- **Chapter ID** is stable for cross-references with [`ProgressTracker/CONTENTS.md`](../ProgressTracker/CONTENTS.md). Chapter IDs denote a planned sequence, not proof of completion.
- **Core - Deep:** derive invariants/correctness/complexity, implement foundational algorithms and solve unseen problems independently.
- **Advanced - Selective:** understand definitions, applicability and limits for all chapters; implement selected high-value techniques. Deep dive where relevant to goals.
- **Architect - Applied / Capstone:** evaluate actual workload, memory, throughput, latency and system constraints; defend trade-offs with benchmarks and evidence.
- **Continuous - Mastery:** practice and retention track active alongside every phase, not a terminal phase to postpone.
- **Existing work:** legacy Java folders remain untouched; past implementations must be linked and reviewed later, not automatically marked as completed lessons.
- **Learning workflow:** concept → intuition/visualization → formal mechanism and complexity → guided dry run → implementation or design evidence → learner-approved chapter-note creation. This file defines coverage, not the yet-to-be-written instruction workflow.
- **No prematurely broken links:** chapter notes and practice links are intentionally absent until their artifacts exist. [`CONTENTS.md`](../ProgressTracker/CONTENTS.md) lists planned chapters and links to headings here.

## Suggested path through the material

1. Follow Phases **0–3** in order to develop complexity foundations, core structures, patterns, recursion and sorting.
2. Complete the **core** of Phases **4–6** before deep specialization; revisit advanced segments when a capstone requires them.
3. Treat Phases **7–9** as advanced theory and selective implementation tracks, with prerequisites followed as needed.
4. Study Phase **10** for production algorithm engineering, and execute at least **three diverse Phase 11 capstones** as evidence.
5. Run Phase **12 from day one**: daily/weekly problem solving, mistake analysis, retention and realistic mock interviews.

## Phases and chapters

## Phase 0: Mathematical Foundations and Algorithmic Thinking

**Target depth:** Core - Deep.
**Prerequisites:** Comfortable writing simple Java programs; no prior formal algorithms course assumed.
**Phase exit evidence:** Analyze nontrivial code, justify asymptotic bounds and correctness, and test independently.
**Suggested visuals:** Growth curves, cost tables, recursion trees, memory diagrams, proof invariants and benchmark comparisons.

### Algorithmic Thinking (DSA-0.01)

**Coverage depth:** Core - Deep.

- **Foundation and mechanisms:** Problem statements, contracts and constraints; input size and data shape; brute-force baseline and iterative refinement.
- **Advanced depth, edge cases and trade-offs:** Distinguish problem, algorithm and implementation; derive candidate approaches from constraints; state assumptions and failure conditions.
- **Practice / assessment evidence:** Model a new problem, compare brute-force and optimized approaches, and explain chosen representation.

### Complexity Analysis (DSA-0.02)

**Coverage depth:** Core - Deep.

- **Foundation and mechanisms:** Big-O, Big-Omega and Big-Theta; worst, best, average and expected cases; nested loops, two pointers and logarithms.
- **Advanced depth, edge cases and trade-offs:** Dominant terms vs constants; tight vs loose bounds; auxiliary vs total space; input-dependent complexity.
- **Practice / assessment evidence:** Annotate several Java snippets with justified time and space bounds.

### Recurrences (DSA-0.03)

**Coverage depth:** Core - Deep.

- **Foundation and mechanisms:** Recursive cost equations; recursion trees; substitution method; Master theorem applicable cases.
- **Advanced depth, edge cases and trade-offs:** Nonstandard recurrences and Master theorem limitations; recursion depth, stack cost and output-sensitive bounds.
- **Practice / assessment evidence:** Solve recurrence examples by two methods and test empirical growth.

### Mathematical Reasoning (DSA-0.04)

**Coverage depth:** Core - Deep.

- **Foundation and mechanisms:** Sets, relations and functions; logarithms, powers and summations; permutations and combinations.
- **Advanced depth, edge cases and trade-offs:** Counting principles, pigeonhole principle, useful inequalities and asymptotic reasoning.
- **Practice / assessment evidence:** Derive counts for traversal, subset generation and common loops.

### Correctness Proofs (DSA-0.05)

**Coverage depth:** Core - Deep.

- **Foundation and mechanisms:** Preconditions, postconditions and invariants; induction; termination; contradiction and counterexamples.
- **Advanced depth, edge cases and trade-offs:** Prove partial and total correctness; distinguish testing from proof; construct minimal counterexamples.
- **Practice / assessment evidence:** Write loop-invariant proof and validate boundary cases of an implementation.

### Amortized Analysis (DSA-0.06)

**Coverage depth:** Core - Deep.

- **Foundation and mechanisms:** Aggregate, accounting and potential methods; dynamic array resizing; repeated stack operations.
- **Advanced depth, edge cases and trade-offs:** Separate occasional costly steps from average cost per operation; articulate worst-case vs amortized guarantees.
- **Practice / assessment evidence:** Explain doubling-array append with aggregate and potential reasoning.

### Probability Foundations (DSA-0.07)

**Coverage depth:** Core - Deep.

- **Foundation and mechanisms:** Sample spaces, conditional probability and independence; expectation and linearity; randomized choices.
- **Advanced depth, edge cases and trade-offs:** Randomized runtime, collision risk, probability of failure and concentration intuition.
- **Practice / assessment evidence:** Analyze expected cost of hashing or randomized pivot selection.

### Java for Algorithms (DSA-0.08)

**Coverage depth:** Core - Deep.

- **Foundation and mechanisms:** Collections, arrays, lists, maps, sets and comparators; generics and equality/hashCode; primitive vs boxed values.
- **Advanced depth, edge cases and trade-offs:** ArrayDeque vs Stack, stable ordering, overflow, immutability, object allocation, Java version compatibility.
- **Practice / assessment evidence:** Build small benchmark or implementation comparing collection choices.

### Engineering Reliable Algorithms (DSA-0.09)

**Coverage depth:** Core - Deep.

- **Foundation and mechanisms:** Deterministic unit tests; edge and boundary cases; randomized, property-based and differential tests.
- **Advanced depth, edge cases and trade-offs:** Separate algorithm from I/O; measure before optimizing; warmup, allocation and JVM benchmark caveats.
- **Practice / assessment evidence:** Create a test matrix and differential-test an algorithm against a simple baseline.

## Phase 1: Linear Data Structures and Hashing

**Target depth:** Core - Deep.
**Prerequisites:** Phase 0 complexity, invariants and Java reference semantics.
**Phase exit evidence:** Build and test the standard linear structures and explain their invariants, complexity and memory trade-offs.
**Suggested visuals:** Array memory layouts, pointer diagrams, stack/queue state timelines and hash collision maps.

### Arrays (DSA-1.01)

**Coverage depth:** Core - Deep.

- **Foundation and mechanisms:** Contiguous storage, indexing, updates and scans; insertion/deletion; in-place transformations.
- **Advanced depth, edge cases and trade-offs:** Bounds and overflow safety; cache locality, copies, two-dimensional layouts and aliasing.
- **Practice / assessment evidence:** Implement insertion, deletion and rotation with tests and complexity explanation.

### Dynamic Arrays (DSA-1.02)

**Coverage depth:** Core - Deep.

- **Foundation and mechanisms:** Capacity vs size; geometric resizing; append, insert and remove; amortized behavior.
- **Advanced depth, edge cases and trade-offs:** Resizing factor trade-offs; memory overhead, shrink policies and iterator invalidation.
- **Practice / assessment evidence:** Build a minimal resizable array with capacity-growth tests.

### Strings (DSA-1.03)

**Coverage depth:** Core - Deep.

- **Foundation and mechanisms:** Java String immutability; StringBuilder; substrings and frequency tables; character iteration.
- **Advanced depth, edge cases and trade-offs:** UTF-16 code units vs Unicode code points; normalization and case-folding pitfalls; allocation costs.
- **Practice / assessment evidence:** Solve a Unicode-aware counting example and compare immutable/append strategies.

### Singly Linked Lists (DSA-1.04)

**Coverage depth:** Core - Deep.

- **Foundation and mechanisms:** Node structure, traversal, head/tail insertion, deletion and reversal; cycle detection.
- **Advanced depth, edge cases and trade-offs:** Pointer ownership, null and single-element cases, dummy heads and invariant restoration.
- **Practice / assessment evidence:** Implement and test singly list operations including cycle scenarios.

### Doubly and Circular Linked Lists (DSA-1.05)

**Coverage depth:** Core - Deep.

- **Foundation and mechanisms:** Prev/next link invariants; insertion/deletion; circular-head and tail handling.
- **Advanced depth, edge cases and trade-offs:** O(1) operations with tail references; sentinel nodes; failure cases from stale links.
- **Practice / assessment evidence:** Test empty, singleton and multi-node operations for both structures.

### Stacks (DSA-1.06)

**Coverage depth:** Core - Deep.

- **Foundation and mechanisms:** Array/list-backed stacks; push/pop/peek; min stack; balanced brackets and expression evaluation.
- **Advanced depth, edge cases and trade-offs:** Monotonic stacks, auxiliary-space trade-offs, overflow/underflow contracts.
- **Practice / assessment evidence:** Implement stack and min stack; demonstrate invariant across duplicate minima.

### Queues and Deques (DSA-1.07)

**Coverage depth:** Core - Deep.

- **Foundation and mechanisms:** FIFO and double-ended semantics; circular-buffer implementation; Java ArrayDeque.
- **Advanced depth, edge cases and trade-offs:** Capacity handling, wraparound, producer/consumer motivations and operation contracts.
- **Practice / assessment evidence:** Implement circular queue and deque edge-case tests.

### Hash Tables (DSA-1.08)

**Coverage depth:** Core - Deep.

- **Foundation and mechanisms:** Hash function and hashCode contract; collisions, chaining and probing; resizing/load factor.
- **Advanced depth, edge cases and trade-offs:** Clustering, deletion tombstones, adversarial keys and hash-flooding resilience.
- **Practice / assessment evidence:** Implement basic hash map, test collisions and measure load-factor effects.

### Maps and Sets (DSA-1.09)

**Coverage depth:** Core - Deep.

- **Foundation and mechanisms:** Hash maps/sets vs ordered maps/sets; lookup, insertion and range traversal; deduplication.
- **Advanced depth, edge cases and trade-offs:** Equality, ordering, custom comparators and mutating-key hazards.
- **Practice / assessment evidence:** Select and justify map/set variants for representative workloads.

### Composite Data Structures (DSA-1.10)

**Coverage depth:** Core - Deep.

- **Foundation and mechanisms:** Queue with stacks, stack with minimum, set of stacks and LRU cache fundamentals.
- **Advanced depth, edge cases and trade-offs:** State invariants across composed structures; API behavior vs implementation details.
- **Practice / assessment evidence:** Implement at least two composite structures with invariant-focused tests.

## Phase 2: Essential Problem-Solving Patterns

**Target depth:** Core - Deep.
**Prerequisites:** Phase 1 arrays, strings, linked lists, maps, stacks and complexity.
**Phase exit evidence:** Recognize patterns from constraints, derive invariants and solve unseen medium-level problems with appropriate techniques.
**Suggested visuals:** Moving-pointer traces, window state grids, prefix tables, interval sweeps and monotonic-stack animations or frames.

### Two Pointers (DSA-2.01)

**Coverage depth:** Core - Deep.

- **Foundation and mechanisms:** Opposing pointers, same-direction pointers, sorted input assumptions; partition and deduplication.
- **Advanced depth, edge cases and trade-offs:** Maintain window/pointer invariants; in-place transformations and proof of linear work.
- **Practice / assessment evidence:** Derive and implement two distinct two-pointer problems.

### Fast and Slow Pointers (DSA-2.02)

**Coverage depth:** Core - Deep.

- **Foundation and mechanisms:** Tortoise-hare cycle detection; midpoint and linked-list transformations.
- **Advanced depth, edge cases and trade-offs:** Why meeting implies a cycle; entry detection proof, even/odd length boundaries.
- **Practice / assessment evidence:** Explain Floyd cycle detection and solve cycle-entry case.

### Sliding Window (DSA-2.03)

**Coverage depth:** Core - Deep.

- **Foundation and mechanisms:** Fixed-length and variable-length windows; counts, sums and frequency constraints.
- **Advanced depth, edge cases and trade-offs:** Monotone feasibility assumptions; handling negatives, repeated characters and invalid window states.
- **Practice / assessment evidence:** Solve fixed and variable-window problems with trace tables.

### Prefix Sums (DSA-2.04)

**Coverage depth:** Core - Deep.

- **Foundation and mechanisms:** Prefix accumulation and range queries; subarray sum/count using hash maps.
- **Advanced depth, edge cases and trade-offs:** Zero initialization, negative numbers, modulo variants and multidimensional prefix sums.
- **Practice / assessment evidence:** Implement subarray-count and range-query problems, test negatives.

### Difference Arrays (DSA-2.05)

**Coverage depth:** Core - Deep.

- **Foundation and mechanisms:** Range increment/decrement; boundary events; reconstruction via prefix sums.
- **Advanced depth, edge cases and trade-offs:** Half-open intervals, event collisions, offline processing and memory trade-offs.
- **Practice / assessment evidence:** Implement batched range updates and compare naive approach.

### Binary Search Patterns (DSA-2.06)

**Coverage depth:** Core - Deep.

- **Foundation and mechanisms:** Exact search, lower/upper bound, first/last true and search-on-answer.
- **Advanced depth, edge cases and trade-offs:** Monotonic predicate proof; overflow-safe midpoints; inclusive/exclusive boundaries.
- **Practice / assessment evidence:** Prove monotonicity and solve one answer-space search.

### Monotonic Stack (DSA-2.07)

**Coverage depth:** Core - Deep.

- **Foundation and mechanisms:** Next greater/smaller, stock span, histogram and contribution counting.
- **Advanced depth, edge cases and trade-offs:** Tie-breaking and duplicate values; each element pushed/popped once; index vs value storage.
- **Practice / assessment evidence:** Derive O(n) histogram or span algorithm and justify linear bound.

### Monotonic Queue (DSA-2.08)

**Coverage depth:** Core - Deep.

- **Foundation and mechanisms:** Deque maintained by dominance; sliding-window max/min.
- **Advanced depth, edge cases and trade-offs:** Expiration indices, duplicate handling and why amortized O(n) holds.
- **Practice / assessment evidence:** Implement deque-based window maximum with trace and tests.

### Hash-Based Patterns (DSA-2.09)

**Coverage depth:** Core - Deep.

- **Foundation and mechanisms:** Frequency maps, complement search, grouping, prefix hashes and deduplication.
- **Advanced depth, edge cases and trade-offs:** Collision assumptions, deterministic ordering needs and memory/performance trade-offs.
- **Practice / assessment evidence:** Solve unseen map-based problems and justify chosen key representation.

### Intervals and Sweep Line (DSA-2.10)

**Coverage depth:** Core - Deep.

- **Foundation and mechanisms:** Interval sorting/merging; overlap tests; endpoints as events; room/coverage counting.
- **Advanced depth, edge cases and trade-offs:** Open/closed endpoint conventions, stable event order and tie semantics.
- **Practice / assessment evidence:** Solve scheduling overlap with a documented endpoint policy.

### Matrix and Grid Patterns (DSA-2.11)

**Coverage depth:** Core - Deep.

- **Foundation and mechanisms:** Row-column traversal, rotations, flood-fill modeling and neighbor enumeration.
- **Advanced depth, edge cases and trade-offs:** Index bounds, mutation vs visited sets and asymptotic costs of 2D layouts.
- **Practice / assessment evidence:** Implement grid transformation and a traversal with edge-case tests.

### In-Place and Index Patterns (DSA-2.12)

**Coverage depth:** Core - Deep.

- **Foundation and mechanisms:** Cyclic placement, index-as-state, array partitioning and constant-space marking.
- **Advanced depth, edge cases and trade-offs:** Required input-value ranges, mutation constraints and duplicate handling.
- **Practice / assessment evidence:** Show an in-place optimization and state its assumptions.

## Phase 3: Recursion, Divide and Conquer, Searching and Sorting

**Target depth:** Core - Deep.
**Prerequisites:** Phases 0-2, particularly recurrences and array operations.
**Phase exit evidence:** Derive, implement and test core recursive, searching and sorting algorithms; explain correctness and performance.
**Suggested visuals:** Recursion/call trees, backtracking decision trees, sorting partition frames and empirical timing plots.

### Recursion Fundamentals (DSA-3.01)

**Coverage depth:** Core - Deep.

- **Foundation and mechanisms:** Call frames, base cases, recurrence and return-value composition; recursion vs iteration.
- **Advanced depth, edge cases and trade-offs:** Tail calls in Java, stack overflow, memoization triggers and state restoration.
- **Practice / assessment evidence:** Trace stack frames and implement recursive plus iterative variants.

### Backtracking Fundamentals (DSA-3.02)

**Coverage depth:** Core - Deep.

- **Foundation and mechanisms:** Decision trees, choose-explore-undo, feasibility checks and pruning.
- **Advanced depth, edge cases and trade-offs:** Completeness vs pruning safety; constraint propagation and duplicate-state avoidance.
- **Practice / assessment evidence:** Implement a constraint-search problem with a documented prune rule.

### Combinatorial Generation (DSA-3.03)

**Coverage depth:** Core - Deep.

- **Foundation and mechanisms:** Subsets, permutations, combinations, K-ary strings and duplicate handling.
- **Advanced depth, edge cases and trade-offs:** Output-size lower bounds, lexicographic ordering, state reuse and backtracking invariants.
- **Practice / assessment evidence:** Generate and validate counts for combinatorial families.

### Divide and Conquer (DSA-3.04)

**Coverage depth:** Core - Deep.

- **Foundation and mechanisms:** Partition, recursively solve and combine; recurrence formulation.
- **Advanced depth, edge cases and trade-offs:** Merge costs, balanced vs imbalanced splits and work/span intuition.
- **Practice / assessment evidence:** Derive recurrence and implement divide-and-conquer example.

### Elementary Sorting (DSA-3.05)

**Coverage depth:** Core - Deep.

- **Foundation and mechanisms:** Insertion, selection and bubble sort; stability and best/worst cases.
- **Advanced depth, edge cases and trade-offs:** Why insertion sort can win on tiny/nearly sorted arrays; avoid needless sorts.
- **Practice / assessment evidence:** Implement and profile elementary sorts on different distributions.

### Efficient Comparison Sorting (DSA-3.06)

**Coverage depth:** Core - Deep.

- **Foundation and mechanisms:** Merge sort, quicksort, heapsort; partitioning and heap operations.
- **Advanced depth, edge cases and trade-offs:** Pivot selection, worst-case safeguards, stability, extra memory and recursion depth.
- **Practice / assessment evidence:** Implement and compare three sorts for random and adversarial inputs.

### Non-Comparison Sorting (DSA-3.07)

**Coverage depth:** Core - Deep.

- **Foundation and mechanisms:** Counting, radix and bucket sorting; domain/range assumptions.
- **Advanced depth, edge cases and trade-offs:** Negative keys, stable passes, space cost and when comparison bounds do not apply.
- **Practice / assessment evidence:** Implement counting/radix sorting with explicit key constraints.

### Searching and Selection (DSA-3.08)

**Coverage depth:** Core - Deep.

- **Foundation and mechanisms:** Linear/binary search; quickselect; k-th order statistics.
- **Advanced depth, edge cases and trade-offs:** Median-of-medians concept, expected vs worst-case selection and duplicates.
- **Practice / assessment evidence:** Implement quickselect and cross-check with full sort.

### Sorting Theory (DSA-3.09)

**Coverage depth:** Core - Deep.

- **Foundation and mechanisms:** Comparison decision-tree lower bound; stable vs unstable; in-place vs auxiliary memory.
- **Advanced depth, edge cases and trade-offs:** Input entropy, adaptivity and adversarial data; correctness of comparison relations.
- **Practice / assessment evidence:** Explain limits of comparison sorting and choose suitable algorithm.

### Algorithm Engineering for Sorting (DSA-3.10)

**Coverage depth:** Core - Deep.

- **Foundation and mechanisms:** Hybrid sorting and library behavior; benchmarking; data-shape considerations.
- **Advanced depth, edge cases and trade-offs:** Cache effects, branch prediction, allocation and JVM measurement pitfalls.
- **Practice / assessment evidence:** Build repeatable sorting experiments and summarize findings.

## Phase 4: Trees, Heaps and Advanced Data Structures

**Target depth:** Core + Advanced.
**Prerequisites:** Phases 0-3, recursion, invariants and comparison-based ordering.
**Phase exit evidence:** Implement foundational tree-based structures and evaluate query/update/memory trade-offs of advanced variants.
**Suggested visuals:** Tree rotations, traversal states, heap-array mappings, trie paths and range-query decomposition.

### Binary Trees (DSA-4.01)

**Coverage depth:** Core + Advanced.

- **Foundation and mechanisms:** Nodes, height/depth, binary representations and tree traversals.
- **Advanced depth, edge cases and trade-offs:** Recursive vs iterative traversal, skewed trees, stack memory and representation trade-offs.
- **Practice / assessment evidence:** Implement DFS/BFS traversals and validate order.

### Tree Algorithms (DSA-4.02)

**Coverage depth:** Core + Advanced.

- **Foundation and mechanisms:** LCA, diameter, path sums, subtree properties and iterative tree analysis.
- **Advanced depth, edge cases and trade-offs:** Return-value contracts, rerooting intuition and null/singleton cases.
- **Practice / assessment evidence:** Derive and test multiple tree property algorithms.

### Binary Search Trees (DSA-4.03)

**Coverage depth:** Core + Advanced.

- **Foundation and mechanisms:** BST ordering, search, insertion, deletion and successor/predecessor.
- **Advanced depth, edge cases and trade-offs:** Deletion cases, sorted-input degeneration and invariants after mutation.
- **Practice / assessment evidence:** Implement BST CRUD and invariant-checking tests.

### Balanced Search Trees (DSA-4.04)

**Coverage depth:** Core + Advanced.

- **Foundation and mechanisms:** AVL balance conditions and rotations; Red-Black color invariants.
- **Advanced depth, edge cases and trade-offs:** Rotation correctness, height guarantees and when ordered maps beat hashing.
- **Practice / assessment evidence:** Implement AVL rotations or a small AVL tree; explain Red-Black concepts.

### Heaps and Priority Queues (DSA-4.05)

**Coverage depth:** Core + Advanced.

- **Foundation and mechanisms:** Binary heap layout, swim/sink, heapify, priority scheduling and top-K.
- **Advanced depth, edge cases and trade-offs:** Decrease-key limitations, lazy deletion, duplicate priorities and O(n) heapify.
- **Practice / assessment evidence:** Implement min/max heap and top-K examples.

### Tries (DSA-4.06)

**Coverage depth:** Core + Advanced.

- **Foundation and mechanisms:** Character-edge paths, prefix search, insertion/deletion and autocomplete.
- **Advanced depth, edge cases and trade-offs:** Sparse vs dense child representation, Unicode and memory overhead.
- **Practice / assessment evidence:** Build prefix trie with delete and memory discussion.

### Range-Query Structures (DSA-4.07)

**Coverage depth:** Core + Advanced.

- **Foundation and mechanisms:** Fenwick tree; segment tree; range sum/min and lazy propagation.
- **Advanced depth, edge cases and trade-offs:** Associativity requirements, point vs range updates, indexing and lazy correctness.
- **Practice / assessment evidence:** Implement Fenwick and segment tree with randomized baseline tests.

### Static Range Queries (DSA-4.08)

**Coverage depth:** Core + Advanced.

- **Foundation and mechanisms:** Sparse table construction, RMQ and idempotent range queries.
- **Advanced depth, edge cases and trade-offs:** O(1) query conditions, sparse-table overlap trick and mutable-data limitations.
- **Practice / assessment evidence:** Construct sparse table and compare against segment tree.

### Advanced Search Structures (DSA-4.09)

**Coverage depth:** Advanced - Selective.

- **Foundation and mechanisms:** Skip lists; order-statistic trees; augmented metadata.
- **Advanced depth, edge cases and trade-offs:** Expected balancing vs deterministic guarantees; rank/select queries and maintenance.
- **Practice / assessment evidence:** Explain skip-list level distribution and augment a search tree conceptually.

### Persistence and Structural Sharing (DSA-4.10)

**Coverage depth:** Advanced - Selective.

- **Foundation and mechanisms:** Persistent versions, path copying and immutable updates.
- **Advanced depth, edge cases and trade-offs:** Version memory costs, copy-on-write and snapshot read behavior.
- **Practice / assessment evidence:** Implement a simple persistent tree or demonstrate path copying.

### Specialized Trees (DSA-4.11)

**Coverage depth:** Advanced - Selective.

- **Foundation and mechanisms:** Interval trees and augmented range queries; advanced spatial/range variants.
- **Advanced depth, edge cases and trade-offs:** Choose augmentations based on query workload; maintenance complexity and limits.
- **Practice / assessment evidence:** Design an augmented tree invariant for overlap search.

## Phase 5: Graph Data Structures and Algorithms

**Target depth:** Core + Advanced.
**Prerequisites:** Trees, heaps, recursion, hashing and complexity analysis.
**Phase exit evidence:** Model unfamiliar systems as graphs, implement central graph algorithms and defend their assumptions.
**Suggested visuals:** Traversal frontiers, topological DAGs, DSU merges, shortest-path relaxations and residual flow networks.

### Graph Modeling (DSA-5.01)

**Coverage depth:** Core + Advanced.

- **Foundation and mechanisms:** Directed/undirected and weighted/unweighted graphs; adjacency list/matrix; density.
- **Advanced depth, edge cases and trade-offs:** Model dependencies, connectivity, multi-edges, self-loops and state graphs.
- **Practice / assessment evidence:** Represent same graph two ways and justify memory/operation costs.

### Breadth-First Search (DSA-5.02)

**Coverage depth:** Core + Advanced.

- **Foundation and mechanisms:** Queue-based graph traversal, levels and unweighted shortest paths.
- **Advanced depth, edge cases and trade-offs:** Visited timing, multi-source BFS and implicit-state graphs.
- **Practice / assessment evidence:** Implement BFS and reconstruct shortest unweighted path.

### Depth-First Search (DSA-5.03)

**Coverage depth:** Core + Advanced.

- **Foundation and mechanisms:** Recursive/iterative DFS, timestamps, cycles and connected components.
- **Advanced depth, edge cases and trade-offs:** Gray/black states, traversal forests and stack-depth constraints.
- **Practice / assessment evidence:** Implement DFS cycle detection for directed and undirected graphs.

### DAGs and Topological Sorting (DSA-5.04)

**Coverage depth:** Core + Advanced.

- **Foundation and mechanisms:** Kahn and DFS ordering; DAG dynamic programming; dependency resolution.
- **Advanced depth, edge cases and trade-offs:** Cycle detection, nonunique valid orders and critical-path intuition.
- **Practice / assessment evidence:** Build a dependency scheduler orderer with cycle handling.

### Graph Connectivity (DSA-5.05)

**Coverage depth:** Core + Advanced.

- **Foundation and mechanisms:** Strongly connected components, bridges and articulation points.
- **Advanced depth, edge cases and trade-offs:** Tarjan/Kosaraju ideas, low-link values and structural vulnerability.
- **Practice / assessment evidence:** Implement SCC algorithm and explain bridge/articulation detection.

### Disjoint Set Union (DSA-5.06)

**Coverage depth:** Core + Advanced.

- **Foundation and mechanisms:** Find/union, path compression, union by size/rank.
- **Advanced depth, edge cases and trade-offs:** Amortized near-constant guarantees, rollback concept and representative invariants.
- **Practice / assessment evidence:** Implement DSU with connected-component tests.

### Minimum Spanning Trees (DSA-5.07)

**Coverage depth:** Core + Advanced.

- **Foundation and mechanisms:** Kruskal, Prim, cut/cycle properties and proof outlines.
- **Advanced depth, edge cases and trade-offs:** Disconnected graphs, equal weights and sorting/heap trade-offs.
- **Practice / assessment evidence:** Implement both algorithms and cross-check total forest cost.

### Shortest Paths (DSA-5.08)

**Coverage depth:** Core + Advanced.

- **Foundation and mechanisms:** Dijkstra and Bellman-Ford; relaxation; negative edges and cycles.
- **Advanced depth, edge cases and trade-offs:** Heap stale entries, infinity/overflow, path reconstruction and correctness assumptions.
- **Practice / assessment evidence:** Choose algorithm by edge constraints and test negative-cycle cases.

### Specialized Shortest Paths (DSA-5.09)

**Coverage depth:** Core + Advanced.

- **Foundation and mechanisms:** 0-1 BFS, Floyd-Warshall and A*.
- **Advanced depth, edge cases and trade-offs:** Admissible/consistent heuristics, all-pairs trade-offs and state-space size.
- **Practice / assessment evidence:** Implement one specialized algorithm and explain where it is preferable.

### Network Flow and Matching (DSA-5.10)

**Coverage depth:** Advanced - Selective.

- **Foundation and mechanisms:** Residual graphs, augmenting paths, max-flow/min-cut; bipartite matching.
- **Advanced depth, edge cases and trade-offs:** Capacity constraints, complexity of flow strategies and modeling applications.
- **Practice / assessment evidence:** Model allocation as flow and explain matching construction.

### Advanced Graph Problems (DSA-5.11)

**Coverage depth:** Advanced - Selective.

- **Foundation and mechanisms:** Eulerian paths, graph transformations and search over implicit states.
- **Advanced depth, edge cases and trade-offs:** Degree conditions, connectivity caveats and complexity of expanded state spaces.
- **Practice / assessment evidence:** Solve a transformed-graph problem and justify state representation.

## Phase 6: Greedy Algorithms and Dynamic Programming

**Target depth:** Core - Deep.
**Prerequisites:** Sorting, recursion, graphs, proof techniques and basic combinatorics.
**Phase exit evidence:** Derive optimality arguments and DP state transitions rather than memorize problem-specific recipes.
**Suggested visuals:** Exchange arguments, decision frontiers, memoization DAGs and bottom-up state tables.

### Greedy Thinking (DSA-6.01)

**Coverage depth:** Core - Deep.

- **Foundation and mechanisms:** Local choices, feasibility and optimization objectives; greedy-choice property.
- **Advanced depth, edge cases and trade-offs:** Identify when locally attractive decisions fail; construct counterexamples.
- **Practice / assessment evidence:** Compare a valid greedy problem with a near-identical invalid one.

### Proving Greedy Algorithms (DSA-6.02)

**Coverage depth:** Core - Deep.

- **Foundation and mechanisms:** Exchange arguments, staying-ahead proofs and invariant-based optimality.
- **Advanced depth, edge cases and trade-offs:** Precisely state what the greedy strategy preserves and why exchanges are safe.
- **Practice / assessment evidence:** Write a complete greedy correctness argument.

### Scheduling and Intervals (DSA-6.03)

**Coverage depth:** Core - Deep.

- **Foundation and mechanisms:** Activity selection, meeting rooms, deadline selection and resource allocation.
- **Advanced depth, edge cases and trade-offs:** Sort keys, tie handling, feasibility constraints and alternative objectives.
- **Practice / assessment evidence:** Implement interval scheduling and analyze failure of wrong criteria.

### Greedy Structures (DSA-6.04)

**Coverage depth:** Core - Deep.

- **Foundation and mechanisms:** Heap-driven decisions, sorting-based greedy, Huffman coding.
- **Advanced depth, edge cases and trade-offs:** Priority update invariants, weighted costs and optimal merge patterns.
- **Practice / assessment evidence:** Implement Huffman coding or optimal merge and explain greedy proof.

### Dynamic Programming Foundations (DSA-6.05)

**Coverage depth:** Core - Deep.

- **Foundation and mechanisms:** Overlapping subproblems, optimal substructure; state, recurrence, base cases.
- **Advanced depth, edge cases and trade-offs:** Top-down vs bottom-up, state dimension choices, dependency order and complexity.
- **Practice / assessment evidence:** Derive a recurrence from a naive recursive problem before coding.

### Linear and Grid DP (DSA-6.06)

**Coverage depth:** Core - Deep.

- **Foundation and mechanisms:** One-dimensional recurrence and grid path/cost optimization.
- **Advanced depth, edge cases and trade-offs:** Obstacles, boundary conditions, negative values and rolling-array optimization.
- **Practice / assessment evidence:** Implement memoized and tabulated versions with same test set.

### Knapsack Family (DSA-6.07)

**Coverage depth:** Core - Deep.

- **Foundation and mechanisms:** 0/1, unbounded, subset sum, target sum and counting vs optimization.
- **Advanced depth, edge cases and trade-offs:** Iteration direction, duplicate choices, pseudopolynomial complexity and memory cost.
- **Practice / assessment evidence:** Derive and solve 0/1 plus unbounded variant.

### Sequence DP (DSA-6.08)

**Coverage depth:** Core - Deep.

- **Foundation and mechanisms:** LCS, LIS and edit distance.
- **Advanced depth, edge cases and trade-offs:** O(n log n) LIS idea, operation costs, reconstruction and alignment interpretation.
- **Practice / assessment evidence:** Implement LCS/edit-distance and reconstruct one solution.

### Counting DP (DSA-6.09)

**Coverage depth:** Core - Deep.

- **Foundation and mechanisms:** Counting paths/arrangements, ways vs feasibility, modulo arithmetic.
- **Advanced depth, edge cases and trade-offs:** Overflow, combinatorial double-counting and state validity.
- **Practice / assessment evidence:** Solve counting problem with correctness argument.

### DP Reconstruction and Optimization (DSA-6.10)

**Coverage depth:** Core - Deep.

- **Foundation and mechanisms:** Parent pointers, storing decisions, rolling arrays and state pruning.
- **Advanced depth, edge cases and trade-offs:** Trade memory for reconstruction; avoid incorrect updates and hidden dependencies.
- **Practice / assessment evidence:** Return an actual optimal solution, not just its numeric score.

## Phase 7: Advanced Dynamic Programming and Optimization

**Target depth:** Advanced - Selective Deep Dives.
**Prerequisites:** Phase 6 dynamic programming and strong recurrence/complexity fundamentals.
**Phase exit evidence:** Recognize specialized state structures and optimize transitions when their mathematical preconditions hold.
**Suggested visuals:** Interval dependency grids, subset masks, digit automata and optimized transition diagrams.

### Interval DP (DSA-7.01)

**Coverage depth:** Advanced - Selective Deep Dives.

- **Foundation and mechanisms:** DP on ranges, split points and matrix-chain multiplication.
- **Advanced depth, edge cases and trade-offs:** Order by interval length, cubic transitions and cost-model assumptions.
- **Practice / assessment evidence:** Derive interval recurrence and reconstruct split decisions.

### Tree DP (DSA-7.02)

**Coverage depth:** Advanced - Selective Deep Dives.

- **Foundation and mechanisms:** States rooted at a node, subtree combination and rerooting.
- **Advanced depth, edge cases and trade-offs:** Parent exclusion, directed-edge messages and iterative handling of deep trees.
- **Practice / assessment evidence:** Solve subtree optimization and outline rerooting transition.

### Bitmask DP (DSA-7.03)

**Coverage depth:** Advanced - Selective Deep Dives.

- **Foundation and mechanisms:** Subset states, assignment problems and TSP-style transitions.
- **Advanced depth, edge cases and trade-offs:** O(n 2^n) state bounds, iteration over submasks and memory optimization.
- **Practice / assessment evidence:** Implement small assignment/subset DP and verify brute force.

### Digit DP (DSA-7.04)

**Coverage depth:** Advanced - Selective Deep Dives.

- **Foundation and mechanisms:** Prefix restrictions, tight flag, leading zeros and counting under an upper bound.
- **Advanced depth, edge cases and trade-offs:** Memoization scope, multiple constraints and inclusive range queries.
- **Practice / assessment evidence:** Build a digit-counting DP with small-range differential testing.

### State-Space Optimization (DSA-7.05)

**Coverage depth:** Advanced - Selective Deep Dives.

- **Foundation and mechanisms:** Rolling arrays, sparse memoization and compressed state encodings.
- **Advanced depth, edge cases and trade-offs:** Preserve dependency order; memory/cache trade-offs and reconstruction needs.
- **Practice / assessment evidence:** Optimize an existing DP without changing outputs.

### Advanced Transition Techniques (DSA-7.06)

**Coverage depth:** Advanced - Selective Deep Dives.

- **Foundation and mechanisms:** Monotonic queue optimization and convex-hull trick foundations.
- **Advanced depth, edge cases and trade-offs:** Monotonicity/slope conditions, ordering assumptions and numerical precision.
- **Practice / assessment evidence:** Explain when an optimization applies and implement one verified example.

### Divide-and-Conquer DP Optimization (DSA-7.07)

**Coverage depth:** Advanced - Selective Deep Dives.

- **Foundation and mechanisms:** Monotone argmin conditions, partition DP recurrence and optimized search intervals.
- **Advanced depth, edge cases and trade-offs:** Proof obligations for monotonicity and counterexamples when assumptions fail.
- **Practice / assessment evidence:** Contrast O(kn^2) baseline with eligible optimized case.

### DP Correctness and Testing (DSA-7.08)

**Coverage depth:** Advanced - Selective Deep Dives.

- **Foundation and mechanisms:** State meaning, induction over states, brute-force cross-checks and adversarial cases.
- **Advanced depth, edge cases and trade-offs:** Detect invalid state compression, off-by-one and transition-order bugs.
- **Practice / assessment evidence:** Write a DP proof sketch and automated small-instance oracle.

## Phase 8: String Algorithms, Mathematics and Computational Geometry

**Target depth:** Advanced - Selective Deep Dives.
**Prerequisites:** String basics, hashing, recursion, arrays, binary search and complexity.
**Phase exit evidence:** Apply specialized search, counting and geometry tools when workload requirements justify their cost.
**Suggested visuals:** Prefix-function traces, rolling-hash windows, trie automata, number-theory derivations and geometry sketches.

### String Matching (DSA-8.01)

**Coverage depth:** Advanced - Selective Deep Dives.

- **Foundation and mechanisms:** Naive matching, prefix function, KMP and Z-function.
- **Advanced depth, edge cases and trade-offs:** Failure transitions, border properties, linear-time analysis and overlapping matches.
- **Practice / assessment evidence:** Implement KMP or Z-based search and cross-check a naive matcher.

### Rolling Hash (DSA-8.02)

**Coverage depth:** Advanced - Selective Deep Dives.

- **Foundation and mechanisms:** Rabin-Karp, polynomial hashing, sliding updates and substring comparisons.
- **Advanced depth, edge cases and trade-offs:** Collision risk, modular arithmetic, double hashing and security caveats.
- **Practice / assessment evidence:** Implement hash search with collision-aware verification.

### Multi-Pattern Matching (DSA-8.03)

**Coverage depth:** Advanced - Selective Deep Dives.

- **Foundation and mechanisms:** Trie-based scanning and Aho-Corasick automaton overview.
- **Advanced depth, edge cases and trade-offs:** Failure links, overlapping matches and pattern set size complexity.
- **Practice / assessment evidence:** Trace or implement multi-pattern matcher on sample dictionary.

### Advanced Text Indexing (DSA-8.04)

**Coverage depth:** Advanced - Selective Deep Dives.

- **Foundation and mechanisms:** Suffix arrays, LCP and suffix automata conceptual models.
- **Advanced depth, edge cases and trade-offs:** Build/query trade-offs, substring indexing, space costs and when not to use.
- **Practice / assessment evidence:** Compare index choices for large text retrieval workload.

### Number Theory (DSA-8.05)

**Coverage depth:** Advanced - Selective Deep Dives.

- **Foundation and mechanisms:** GCD, Euclid and extended Euclid; modular arithmetic and congruence.
- **Advanced depth, edge cases and trade-offs:** Bezout identity, negative values and integer overflow.
- **Practice / assessment evidence:** Implement GCD and extended Euclid with property checks.

### Primes and Modular Algorithms (DSA-8.06)

**Coverage depth:** Advanced - Selective Deep Dives.

- **Foundation and mechanisms:** Sieve variants, fast modular exponentiation, modular inverses and primality basics.
- **Advanced depth, edge cases and trade-offs:** Prime modulus assumptions, overflow-safe multiplication and probabilistic testing overview.
- **Practice / assessment evidence:** Implement sieve and power mod; explain validity of inverse methods.

### Combinatorics (DSA-8.07)

**Coverage depth:** Advanced - Selective Deep Dives.

- **Foundation and mechanisms:** Permutations, combinations, inclusion-exclusion and combinatorial DP.
- **Advanced depth, edge cases and trade-offs:** Overcounting, repeated values, modulo counting and recurrence derivation.
- **Practice / assessment evidence:** Derive counting formula and validate with enumeration.

### Computational Geometry (DSA-8.08)

**Coverage depth:** Advanced - Selective Deep Dives.

- **Foundation and mechanisms:** Orientation, cross products, distance and segment intersection; convex hull.
- **Advanced depth, edge cases and trade-offs:** Precision/overflow, collinearity, degenerate cases and geometric predicates.
- **Practice / assessment evidence:** Implement orientation/segment intersection and handle degenerate inputs.

### Optional Numerical Algorithms (DSA-8.09)

**Coverage depth:** Optional - Survey.

- **Foundation and mechanisms:** FFT motivation, convolution and polynomial multiplication; matrix exponentiation.
- **Advanced depth, edge cases and trade-offs:** Complexity gains, numerical stability and applicability constraints.
- **Practice / assessment evidence:** Explain a convolution workload and implement matrix exponentiation.

## Phase 9: Advanced Algorithm Design and Complexity Theory

**Target depth:** Advanced - Conceptual + Selected Implementations.
**Prerequisites:** Core algorithms, proofs, probability, graph modeling and DP.
**Phase exit evidence:** Choose among exact, randomized, approximate, online, streaming, parallel and external-memory strategies with defensible guarantees.
**Suggested visuals:** Cost-model comparisons, adversarial constructions, sampling distributions and memory/I-O diagrams.

### Advanced Analysis (DSA-9.01)

**Coverage depth:** Advanced - Conceptual + Selected Implementations.

- **Foundation and mechanisms:** Expected runtime, amortized vs worst-case bounds and distribution-sensitive cost.
- **Advanced depth, edge cases and trade-offs:** Tail probabilities, resource budgets and practical significance of guarantees.
- **Practice / assessment evidence:** Compare multiple complexity guarantees for a production-like workload.

### Randomized Algorithms (DSA-9.02)

**Coverage depth:** Advanced - Conceptual + Selected Implementations.

- **Foundation and mechanisms:** Randomized pivoting, hashing, reservoir sampling and probabilistic design.
- **Advanced depth, edge cases and trade-offs:** Expected correctness/runtime, randomness sources and failure probability.
- **Practice / assessment evidence:** Implement sampling or randomized selection and characterize output quality.

### Lower Bounds (DSA-9.03)

**Coverage depth:** Advanced - Conceptual + Selected Implementations.

- **Foundation and mechanisms:** Decision-tree lower bounds, adversarial arguments and information constraints.
- **Advanced depth, edge cases and trade-offs:** Define computational model, prove limits and avoid invalid universal claims.
- **Practice / assessment evidence:** Demonstrate a lower-bound argument for sorting or comparison queries.

### Computational Complexity (DSA-9.04)

**Coverage depth:** Advanced - Conceptual + Selected Implementations.

- **Foundation and mechanisms:** P, NP, NP-completeness, reductions and intractability intuition.
- **Advanced depth, edge cases and trade-offs:** Decision vs optimization formulations; verification vs solving; consequences for design.
- **Practice / assessment evidence:** Outline a reduction and classify feasible algorithm choices.

### Approximation Algorithms (DSA-9.05)

**Coverage depth:** Advanced - Conceptual + Selected Implementations.

- **Foundation and mechanisms:** Approximation ratios, set-cover/vertex-cover examples and greedy approximation.
- **Advanced depth, edge cases and trade-offs:** Prove ratio within assumptions; trade quality for time; heuristic vs approximation.
- **Practice / assessment evidence:** Provide solution quality guarantee for a small approximation algorithm.

### Online Algorithms (DSA-9.06)

**Coverage depth:** Advanced - Conceptual + Selected Implementations.

- **Foundation and mechanisms:** Unknown future, adversarial sequences and competitive analysis.
- **Advanced depth, edge cases and trade-offs:** Caching and ski-rental examples; deterministic vs randomized online choices.
- **Practice / assessment evidence:** Analyze an online strategy using a competing offline optimum.

### Streaming Algorithms (DSA-9.07)

**Coverage depth:** Advanced - Conceptual + Selected Implementations.

- **Foundation and mechanisms:** Reservoir sampling, approximate counting and bounded-memory sketches.
- **Advanced depth, edge cases and trade-offs:** Error probabilities, mergeability, windowing and single-pass constraints.
- **Practice / assessment evidence:** Build approximate stream statistic and measure error.

### Parallel Algorithms (DSA-9.08)

**Coverage depth:** Advanced - Conceptual + Selected Implementations.

- **Foundation and mechanisms:** Work/span model, parallel recursion and concurrent reduction.
- **Advanced depth, edge cases and trade-offs:** Coordination overhead, contention, speedup bounds and memory effects.
- **Practice / assessment evidence:** Describe parallelization of a divide-and-conquer algorithm with work/span.

### External-Memory Algorithms (DSA-9.09)

**Coverage depth:** Advanced - Conceptual + Selected Implementations.

- **Foundation and mechanisms:** Block I/O model, cache locality, external sorting and multiway merge.
- **Advanced depth, edge cases and trade-offs:** Memory/disk access asymmetry, fan-out and sequential vs random access.
- **Practice / assessment evidence:** Design external sort pipeline and estimate I/O cost.

### Advanced Optimization Models (DSA-9.10)

**Coverage depth:** Advanced - Conceptual + Selected Implementations.

- **Foundation and mechanisms:** Network flow formulations, bipartite matching, linear programming concepts.
- **Advanced depth, edge cases and trade-offs:** When combinatorial formulation helps; reductions to known primitives and relaxations.
- **Practice / assessment evidence:** Translate real allocation problem into a tractable optimization model.

## Phase 10: Production-Grade Data Structures and Algorithms

**Target depth:** Architect - Applied.
**Prerequisites:** Core structures and algorithms; selected advanced tools from Phases 7-9 where applicable.
**Phase exit evidence:** Evaluate data structures with workload shape, latency, memory, concurrency, reliability and operational constraints—not asymptotics alone.
**Suggested visuals:** Disk-page layouts, LSM write paths, cache hit-rate curves, sketch-error plots, ring partitions and JVM profiles.

### B-Trees and B+ Trees (DSA-10.01)

**Coverage depth:** Architect - Applied.

- **Foundation and mechanisms:** Block/page-oriented search trees; splits, merges, fan-out and range traversal.
- **Advanced depth, edge cases and trade-offs:** Read/write amplification, locality, index maintenance and storage-engine trade-offs.
- **Practice / assessment evidence:** Design a disk index model with range-query analysis.

### LSM Trees and Storage Structures (DSA-10.02)

**Coverage depth:** Architect - Applied.

- **Foundation and mechanisms:** Memtables, SSTables, write-ahead logs, compaction and Bloom-filter integration.
- **Advanced depth, edge cases and trade-offs:** Leveling vs tiering, write/read/space amplification and update patterns.
- **Practice / assessment evidence:** Compare B+ tree and LSM designs for two workloads.

### Cache Eviction Algorithms (DSA-10.03)

**Coverage depth:** Architect - Applied.

- **Foundation and mechanisms:** LRU, LFU, recency/frequency signals and admission vs eviction.
- **Advanced depth, edge cases and trade-offs:** Hot-set shifts, pollution, scan resistance, hit ratio and operation cost.
- **Practice / assessment evidence:** Implement/cache-benchmark at least two replacement policies.

### Probabilistic Membership (DSA-10.04)

**Coverage depth:** Architect - Applied.

- **Foundation and mechanisms:** Bloom and Cuckoo filters; membership vs nonmembership guarantees.
- **Advanced depth, edge cases and trade-offs:** False-positive calculation, deletion constraints, resizing and saturation.
- **Practice / assessment evidence:** Implement Bloom filter and measure empirical false positives.

### Approximate Analytics (DSA-10.05)

**Coverage depth:** Architect - Applied.

- **Foundation and mechanisms:** HyperLogLog, Count-Min Sketch, t-digest concepts and streaming Top-K.
- **Advanced depth, edge cases and trade-offs:** Error bounds, mergeability, skew, memory trade-offs and approximate vs exact.
- **Practice / assessment evidence:** Prototype approximate statistic and compare with exact baseline.

### Data Partitioning Algorithms (DSA-10.06)

**Coverage depth:** Architect - Applied.

- **Foundation and mechanisms:** Consistent hashing, rendezvous hashing and key assignment.
- **Advanced depth, edge cases and trade-offs:** Virtual nodes, rebalancing, skew, hotspots and node membership churn.
- **Practice / assessment evidence:** Simulate key movement under topology changes.

### Scheduling Algorithms (DSA-10.07)

**Coverage depth:** Architect - Applied.

- **Foundation and mechanisms:** Priority scheduling, DAG dependencies, fair queues and time/space complexity.
- **Advanced depth, edge cases and trade-offs:** Starvation, priority inversion concepts, capacity constraints and deadline trade-offs.
- **Practice / assessment evidence:** Build small scheduler with dependencies and fairness discussion.

### Search and Retrieval (DSA-10.08)

**Coverage depth:** Architect - Applied.

- **Foundation and mechanisms:** Inverted indexes, token processing, ranking and autocomplete primitives.
- **Advanced depth, edge cases and trade-offs:** Posting lists, compression, update/index freshness and query latency.
- **Practice / assessment evidence:** Implement basic inverted-index search with ranking extension.

### Geospatial Structures (DSA-10.09)

**Coverage depth:** Architect - Applied.

- **Foundation and mechanisms:** Quadtrees, R-trees and bounding-box queries.
- **Advanced depth, edge cases and trade-offs:** Spatial selectivity, uneven density, nearest-neighbor trade-offs and updates.
- **Practice / assessment evidence:** Choose spatial index for representative location queries.

### Vector Search (DSA-10.10)

**Coverage depth:** Architect - Applied.

- **Foundation and mechanisms:** Distance metrics, exact kNN, ANN and HNSW conceptual internals.
- **Advanced depth, edge cases and trade-offs:** Recall-latency-memory trade-offs, index construction, filtering and update challenges.
- **Practice / assessment evidence:** Compare exact search with a small ANN prototype or design simulation.

### Memory-Efficient Data Structures (DSA-10.11)

**Coverage depth:** Architect - Applied.

- **Foundation and mechanisms:** Bitsets, compressed bitmaps, packed fields and compact representations.
- **Advanced depth, edge cases and trade-offs:** Heap/object overhead, cache locality, compression vs CPU and random access.
- **Practice / assessment evidence:** Measure memory and throughput of two representations.

### Algorithm Engineering on the JVM (DSA-10.12)

**Coverage depth:** Architect - Applied.

- **Foundation and mechanisms:** JVM profiling, JMH methodology, allocations, boxing, GC and locality.
- **Advanced depth, edge cases and trade-offs:** Warmup, dead-code elimination, measurement noise and benchmarking validity.
- **Practice / assessment evidence:** Produce reproducible JMH results with profiling notes.

### Concurrency-Aware Data Structures (DSA-10.13)

**Coverage depth:** Architect - Applied.

- **Foundation and mechanisms:** Thread-safe maps/queues, locks, atomics and lock-free concepts.
- **Advanced depth, edge cases and trade-offs:** Contention, linearizability intuition, ABA problem, memory model basics and throughput.
- **Practice / assessment evidence:** Review or implement concurrency-safe structure and test contention.

## Phase 11: Algorithmic Architecture Labs and Capstones

**Target depth:** Architect - Capstone.
**Prerequisites:** Relevant theory and implementation modules; work may proceed incrementally as prerequisites complete.
**Phase exit evidence:** Build end-to-end algorithmic components and defend correctness, benchmarks and architectural choices. Complete at least three diverse capstones.
**Suggested visuals:** Architecture sketches, data-flow graphs, state transitions, benchmark plots and failure/corner-case matrices.

### Build a Collections Library (DSA-11.01)

**Coverage depth:** Architect - Capstone.

- **Foundation and mechanisms:** Reusable arrays/lists, heaps, maps and ordered structures; API contracts and tests.
- **Advanced depth, edge cases and trade-offs:** Compare alternative implementations, allocation profiles, error contracts and generic types.
- **Practice / assessment evidence:** Deliver tested Java library with benchmarks and user-facing documentation.

### Search and Autocomplete Engine (DSA-11.02)

**Coverage depth:** Architect - Capstone.

- **Foundation and mechanisms:** Trie-based prefix lookup, ranking, top-K and text indexing.
- **Advanced depth, edge cases and trade-offs:** Latency/memory, incremental updates, Unicode and relevance-quality trade-offs.
- **Practice / assessment evidence:** Deliver search prototype and measured precision/latency trade-offs.

### Storage Index Simulator (DSA-11.03)

**Coverage depth:** Architect - Capstone.

- **Foundation and mechanisms:** B+ tree and LSM write/read paths, Bloom filters and compaction simulations.
- **Advanced depth, edge cases and trade-offs:** Read/write amplification, scan behavior and workload sensitivity.
- **Practice / assessment evidence:** Compare storage approaches under controlled read/write mixes.

### Streaming Analytics Engine (DSA-11.04)

**Coverage depth:** Architect - Capstone.

- **Foundation and mechanisms:** Top-K, Count-Min Sketch, HyperLogLog and exact baselines.
- **Advanced depth, edge cases and trade-offs:** Estimate accuracy and memory under skew, cardinality shifts and updates.
- **Practice / assessment evidence:** Deliver streaming prototype with error/memory benchmark report.

### Task Scheduler (DSA-11.05)

**Coverage depth:** Architect - Capstone.

- **Foundation and mechanisms:** Priority queues, DAG constraints, dependency validation and execution ordering.
- **Advanced depth, edge cases and trade-offs:** Fairness, starvation, priorities, failure/retry semantics at algorithm boundary.
- **Practice / assessment evidence:** Deliver scheduler prototype with cycle tests and scheduling metrics.

### Route Planner (DSA-11.06)

**Coverage depth:** Architect - Capstone.

- **Foundation and mechanisms:** Graph modeling, Dijkstra, A* and route reconstruction.
- **Advanced depth, edge cases and trade-offs:** Sparsity, heuristic quality, blocked roads and preprocessing trade-offs.
- **Practice / assessment evidence:** Deliver routing prototype with algorithm comparison and correctness tests.

### Multi-Policy Cache (DSA-11.07)

**Coverage depth:** Architect - Capstone.

- **Foundation and mechanisms:** LRU, LFU and admission/eviction policies; trace replay.
- **Advanced depth, edge cases and trade-offs:** Recency/frequency shifts, scan resistance, cache size and workload traces.
- **Practice / assessment evidence:** Deliver comparable caches and hit-rate/latency analysis.

### Vector Search Prototype (DSA-11.08)

**Coverage depth:** Architect - Capstone.

- **Foundation and mechanisms:** Exact kNN, distance functions, ANN/HNSW concepts and top-K.
- **Advanced depth, edge cases and trade-offs:** Recall vs latency, memory footprint, filtering and index maintenance.
- **Practice / assessment evidence:** Deliver small retrieval prototype with recall-latency measurements.

## Phase 12: Interview Mastery, Revision and Independent Problem Solving

**Target depth:** Continuous - Mastery.
**Prerequisites:** Runs in parallel from Phase 0; progressively draws on the full syllabus.
**Phase exit evidence:** Convert knowledge into independent, retained, explainable problem-solving performance under unfamiliar constraints.
**Suggested visuals:** Dry-run boards, pattern-decision trees, scorecards, mistake-frequency charts and spaced-review calendars.

### Problem Decomposition and Constraint Analysis (DSA-12.01)

**Coverage depth:** Continuous - Mastery.

- **Foundation and mechanisms:** Restatement, examples, input sizes, constraints and hidden edge cases.
- **Advanced depth, edge cases and trade-offs:** Translate wording into abstractions and complexity budgets; clarify assumptions.
- **Practice / assessment evidence:** Solve unknown problem setup before discussing code.

### Brute-Force Before Optimization (DSA-12.02)

**Coverage depth:** Continuous - Mastery.

- **Foundation and mechanisms:** Baseline correctness; exhaustive search and complexity analysis.
- **Advanced depth, edge cases and trade-offs:** Recognize repeated work and derive optimizations from bottlenecks.
- **Practice / assessment evidence:** Present baseline, correctness argument and optimization path.

### Pattern Recognition Without Hints (DSA-12.03)

**Coverage depth:** Continuous - Mastery.

- **Foundation and mechanisms:** Mixed-topic problem identification and recognizing competing approaches.
- **Advanced depth, edge cases and trade-offs:** Avoid overfitting to tags, detect invariant and select defensible technique.
- **Practice / assessment evidence:** Solve previously unseen mixed-pattern problems independently.

### Coding with Correctness Invariants (DSA-12.04)

**Coverage depth:** Continuous - Mastery.

- **Foundation and mechanisms:** Explain variables/state, write modular code, validate each step.
- **Advanced depth, edge cases and trade-offs:** State assertions, algorithm invariants, code clarity and failure recovery.
- **Practice / assessment evidence:** Implement problem with rationale for every critical invariant.

### Edge Cases, Debugging and Counterexamples (DSA-12.05)

**Coverage depth:** Continuous - Mastery.

- **Foundation and mechanisms:** Boundary, duplicate, overflow, empty, large and adversarial inputs.
- **Advanced depth, edge cases and trade-offs:** Use differential/property tests, minimal failing examples and reproducible fixes.
- **Practice / assessment evidence:** Build test matrix and explain discovered bug.

### Timed Medium and Hard Problem Solving (DSA-12.06)

**Coverage depth:** Continuous - Mastery.

- **Foundation and mechanisms:** Time-boxing, pacing, trade-offs and solution communication.
- **Advanced depth, edge cases and trade-offs:** When to abandon an approach, optimize under constraints and handle pressure.
- **Practice / assessment evidence:** Complete repeated timed sessions with evidence.

### Mock Interviews and Verbal Explanation (DSA-12.07)

**Coverage depth:** Continuous - Mastery.

- **Foundation and mechanisms:** Clarifying questions, think-aloud reasoning, dry runs, complexity and follow-ups.
- **Advanced depth, edge cases and trade-offs:** Concise communication, interviewer feedback and realistic code review.
- **Practice / assessment evidence:** Record mock scorecards and follow-up improvements.

### Spaced Repetition and Mistake Classification (DSA-12.08)

**Coverage depth:** Continuous - Mastery.

- **Foundation and mechanisms:** Revisit cadence, mistake taxonomy, confidence ratings and retention checks.
- **Advanced depth, edge cases and trade-offs:** Distinguish recalled solution from fresh derivation; select review problems adaptively.
- **Practice / assessment evidence:** Maintain revision record and demonstrate delayed independent solve.

### Mixed-Pattern Challenge Sets (DSA-12.09)

**Coverage depth:** Continuous - Mastery.

- **Foundation and mechanisms:** Combine DP, graphs, heaps, search, hashing and trees without labels.
- **Advanced depth, edge cases and trade-offs:** Identify compositional solutions and trade-offs under unfamiliar constraints.
- **Practice / assessment evidence:** Finish mixed challenge set with independent reasoning notes.

### Senior and Principal Follow-Up Discussions (DSA-12.10)

**Coverage depth:** Continuous - Mastery.

- **Foundation and mechanisms:** Alternate structures, memory/perf trade-offs, benchmarks and production constraints.
- **Advanced depth, edge cases and trade-offs:** Explain scalability limits, pathological cases and API design implications.
- **Practice / assessment evidence:** Defend algorithm choice under changed workload and constraints.

## Programme-wide quality and completion gates

Every chapter must eventually supply the following when taught and completed (this syllabus alone does not create those artifacts):

- **Conceptual understanding:** learner can explain motivation, definitions, mental model and applicable constraints; visual explanations should be used wherever helpful.
- **Correctness and complexity:** learner can state invariants, justify correctness and quantify time/space costs, including relevant boundary cases.
- **Implementation or equivalent evidence:** code plus tests for implementation-heavy chapters; worked proof, benchmark, simulation or design analysis for theory/architecture chapters.
- **Problem-solving independence:** meaningful independent exercise(s) or a justified non-coding alternative; hints and assistance recorded honestly.
- **Retention and application:** review prompts and cross-links to prior/future lessons, interview-style follow-ups and real workload trade-offs.
- **Learner confirmation and repo hygiene:** mark lesson complete only on explicit learner approval; then create the relevant note, synchronize contents/progress/log and practice links, and verify GitHub updates. **Completion is not the same as mastery.**

## Scope boundaries

- Distributed consensus, network protocols, replication semantics and service-level architecture live primarily in the System Design curriculum; this DSA syllabus covers algorithms/data structures that support those systems.
- Very specialized research algorithms (e.g., deeply optimized FFT variants, complete lock-free library implementations, bespoke ANN engines) are optional specialization, not prerequisites for Principal readiness.
- All chapters are planned. No practice problems, completed notes, competency ratings or completion history are asserted by this file.
