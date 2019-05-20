# Kata06: Anagrams
## 问题
1. 我在玩字谜游戏时，给了我一个单词，比如：arrest，程序可以帮我从单词表中找出由arrest中各
字母组成的其他词，例如：raster, raters, Sartre, and starer
1. 我现在想更简单，运行程序，直接把单词表里，将那些彼此是其他单词的字谜的各个单词按行输出，例如：下面的词，是彼此的字谜
- kinship pinkish
- enlist inlets listen silent
- boaster boaters borates
- fresher refresh
- sinks skins
- knits stink
- rots sort
## 任务
1. 从上面的列表中找到最长的字谜串，
1. 从上面的列表中找出包含单词最多的字谜串
## 拆解
1. Word保存一个单词，并通过hashcode（）得到每个字母按字母顺序排序后的哈希码，两个字母相同的Word哈希码相同
1. Anagram通过guess(Word)，判断输入Word与当前字谜是否相同，相同返回true
1. Anagram通过length()可以返回当前字谜串的长度
1. Anagram通过numberOfWords()可以返回当前字谜串的单词数
1. Anagram能将一个新的是其字谜的Word，收入其中，使其length()得到正确的值
1. Anagram能将一个新的是其字谜的Word，收入其中，使其numberOfWords()得到正确的值
1. 从一个给定的List<Word>中，返回Anagrams的集合
1. 给定一个Anagrams集合，通过longest()，拿到最长的Anagram
1. 给定一个Anagrams集合，通过mostWords()，拿到包含Word最多的Anagram
1. 读取文件，将其保存为Word列表
1. 将Word数组按照Word的length，保存成Map<WordLength,List<Word>>

