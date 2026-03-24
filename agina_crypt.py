import base64

def encrypt():
    msg = input('🔐 النص: ')
    print(f'✅ مشفر: {base64.b64encode(msg.encode()).decode()}')

def decrypt():
    msg = input('🔓 الكود: ')
    try: print(f'✅ أصلي: {base64.b64decode(msg.encode()).decode()}')
    except: print('❌ خطأ')

choice = input('1- تشفير | 2- فك: ')
if choice == '1': encrypt()
elif choice == '2': decrypt()