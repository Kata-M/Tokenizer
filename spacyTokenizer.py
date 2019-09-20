import spacy

nlp = spacy.load("en_core_web_sm")

doc1 = nlp(u"I like this assignment: it is fun.")
doc2 = nlp(u"I won a prize, but I won’t be able to attend the ceremony.")
doc3 = nlp(u"“The strange case of Dr. Jekyll and Mr. Hyde” is a famous book... but I haven’t read it.")
doc4 = nlp(u"I work for the C.I.A., and you?")
doc5 = nlp(u"OMG #Twitter is sooooo coooool <3 :-) <– lol...why do i write like this idk right? :) 😻 👍")

print("\n ------- s1\n")
for token in doc1:
	print(token.text)


print("\n ------- s2\n")
for token in doc2:
	print(token.text)


print("\n ------- s3\n")
for token in doc3:
	print(token.text)

print("\n ------- s4\n")
for token in doc4:
	print(token.text)


print("\n ------- s5\n")
for token in doc5:
	print(token.text)