import base64

# --- 🛡️ سرداب أجيـنا - نسخة المطورين 🛡️ ---

def agina_banner():
    # ألوان وترتيب احترافي لترمكس
    print("\033[1;32m" + "="*40)
    print("      🛡️ AGina Crypt - V2.0 🛡️")
    print("      Developer: Mohamed Eltorky")
    print("      Location: Alexandria, Egypt")
    print("="*40 + "\033[0m")

def crypt_level_1(text): # تشفير عادي (Base64)
    return base64.b64encode(text.encode()).decode()

def crypt_level_2(text): # تشفير مزدوج (Deep Crypt)
    first = base64.b64encode(text.encode()).decode()
    return base64.b64encode(first.encode()).decode()

def start_crypt():
    agina_banner()
    print("\033[1;34m[1] تشفير عادي (Normal)\033[0m")
    print("\033[1;31m[2] تشفير أجينا الأسطوري (Deep)\033[0m")
    
    choice = input("\n\033[1;33mاختر مستوى التشفير: \033[0m")
    msg = input("\033[1;37mاكتب النص اللي عايز تحميه: \033[0m")
    
    if choice == '1':
        print(f"\n\033[1;32m🔒 النتيجة: {crypt_level_1(msg)}\033[0m")
    elif choice == '2':
        print(f"\n\033[1;35m🔐 النتيجة الأسطورية: {crypt_level_2(msg)}\033[0m")
    else:
        print("\033[1;31mخطأ في الاختيار! حاول تاني يا بطل.\033[0m")

if __name__ == "__main__":
    start_crypt()
