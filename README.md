# Unexpected removeIf Behavior in Kotlin Collections

This repository demonstrates an uncommon but potentially problematic behavior when using the `removeIf` function on mutable lists and maps in Kotlin.  The issue arises when the removal condition depends on the values of other elements within the same collection.  The iteration order isn't guaranteed and might not be what you expect, resulting in inconsistencies and possibly leaving elements you intended to remove.

The `bug.kt` file shows the problem. The `bugSolution.kt` file provides a safer and more predictable approach to achieving the desired behavior.