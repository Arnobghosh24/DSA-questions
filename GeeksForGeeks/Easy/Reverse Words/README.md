# Reverse Words

## Difficulty: Easy

## Platform: GeeksForGeeks

## Problem Link
[View Problem](https://www.geeksforgeeks.org/problems/reverse-words-in-a-given-string5459/1)

## Solved On
19 Nov 2026 at 07:04 pm

<h2><a href="https://www.geeksforgeeks.org/problems/reverse-words-in-a-given-string5459/1">Reverse Words</a></h2><h3>Difficulty Level: Easy</h3><hr><p><span style="font-size: 14pt;">Given a string <strong>s</strong>, reverse the string without reversing its individual words. Words are separated by dots(.).</span></p><ul><li><span style="font-size: 14pt;"><span style="font-size: 14pt;">The string</span><span style="font-size: 18.6667px;"> may contain leading or trailing dots(.) or multiple dots(.) between two words. </span></span></li><li><span style="font-size: 14pt;"><span style="font-size: 18.6667px;">The returned string should only have a single dot(.) separating the words and</span><span style="font-size: 14pt;">&nbsp;</span><span style="font-size: 14pt;">no extra&nbsp;</span><span style="font-size: 18.6667px;">dots</span><span style="font-size: 14pt;"> should be included.</span></span></li></ul><p><span style="font-size: 14pt;"><strong>Examples :</strong></span></p><pre><span style="font-size: 14pt;"><strong>Input: </strong>s = "i.like.this.program.very.much"<br><strong>Output: </strong>"much.very.program.this.like.i"<strong>
Explanation: </strong></span><span style="font-size: 18.6667px;">The words in the input string are reversed while maintaining the dots as separators, resulting in "much.very.program.this.like.i".</span></pre><pre><span style="font-size: 14pt;"><strong>Input: </strong>s = "..geeks..for.geeks."
<strong>Output: </strong>"geeks.for.geeks"<strong>
Explanation: </strong>After removing extra dots and reversing the whole string, the input string becomes <code>"geeks.for.geeks"</code><span style="font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif;">.</span></span></pre><pre><span style="font-size: 14pt;"><strong>Input: </strong>s = "..home....."
<strong>Output: </strong>"home"<strong>
Explanation: </strong>The input string contains only one word with extra dots around it. After removing the extra dots, the output is <code>"home"</code><span style="font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif;">.</span></span></pre>