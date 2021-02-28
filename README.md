# AES-Cryptography
This tool provides encryption/decrytion according to AES-128 standart. The standart is based on symmetric Rijndael algorithm and regulates work with 128 bit long keys.
## How to use
There are two different classes, one for encrytion, one for decryption.
Both classes have their own main method. Inputs should be set and the output will be desplayed.
### Encryption
Input:\
KEY = Maximam 128 bit hexadecimal number\
i.e. c0000000000000000000000000000000\
PLAIN_TEXT = Maximam 128 bit hexadecimal number\
i.e. 00000000000000000000000000000000\
\
Output:\
CIPHER_TEXT = Maximam 128 bit hexadecimal numbers\
i.e. 4bc3f883450c113c64ca42e1112a9e87
### Decryption
Input:\
KEY = Maximam 128 bit hexadecimal number\
i.e. 80000000000000000000000000000000\
CIPHER_TEXT = Maximam 128 bit hexadecimal number\
i.e. 0edd33d3c621e546455bd8ba1418bec8\
\
Output:\
PLAIN_TEXT = Maximam 128 bit hexadecimal numbers\
i.e. 00000000000000000000000000000000
