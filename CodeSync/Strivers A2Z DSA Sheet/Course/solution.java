/*
 * Platform: LintCode
 * Problem: Course
 * URL: https://www.lintcode.com/problem/1883/description
 * Language: Java
 * Difficulty: Medium
 * Topics: Hash TableSort, Hash Table, Sort, Test Data Commit Output
 * Runtime: N/A
 * Memory: N/A
 * Synced: 2026-07-15T09:44:58.605Z
 */

········}

········//·Step·3:·Min-Heap·to·track·the·top·K·keywords
········//·We·use·a·Min-Heap·so·we·can·easily·evict·the·lowest·priority·item·when·size·>·k.
········PriorityQueue<String>·pq·=·new·PriorityQueue<>((a,·b)·->·{
············int·freqA·=·freqMap.get(a);
············int·freqB·=·freqMap.get(b);
············
············if·(freqA·!=·freqB)·{
················//·Lower·frequency·sits·at·the·top·to·get·kicked·out·first
················return·freqA·-·freqB;·
············}·else·{
················//·If·frequencies·match,·alphabetically·LARGER·string·sits·at·the·top·
················//·so·it·gets·kicked·out·first·(leaving·the·smaller·alphabetical·string)
················return·b.compareTo(a);
