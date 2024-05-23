package com.example.charectersscoped

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        // Adjust for system window insets
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Find views by their IDs
        val inputText: EditText = findViewById(R.id.inputText)
        val enterButton: Button = findViewById(R.id.enterButton)
        val resultText: TextView = findViewById(R.id.resultText)

        // Set an OnClickListener on the button
        enterButton.setOnClickListener {
            // Get the text from the EditText
            val enteredText = inputText.text.toString().trim()

            // Check the first character of the entered text
            if (enteredText.isNotEmpty()) {
                when (enteredText.first().lowercaseChar()) {
                    'k' -> resultText.text =
                        "ទំនាយថា ធុនកណ្តាល មិនល្អពេក មិនអាក្រក់ពេក កុំធ្វើគុណដល់ព្រោះច្រើនបានទុក្ខទោសដល់ខ្លួន បើរកស៊ីជួញដូរល្អគួរសម ធ្វើការរាជការមិនសូវល្អ ចូលចិត្តដើរច្រើន ទ្រព្យសម្បត្តិមានមធ្យម តែចិត្តកំណាញ់បន្តិច។"
                    'n' -> resultText.text =
                        "ទំនាយថា ជាមនុស្សធុនកណ្តាល មានទីលំនៅមិនជាប់លាប់ សេពគប់មិត្តភ័ក្តមិនសូវសមប្រកបធ្វើការរាជការមិនសូវល្អ បើរកស៊ីជួញដូរដោយប្រាជ្ញាច្រើនល្អប្រសើរ អ្នកផងស្រលាញ់ចូលចិត្ត។"
                    's' -> resultText.text =
                        "ទំនាយថា ជាមនុស្សធុនកណ្តាល មានទីលំនៅមិនជាប់លាប់ សេពគប់មិត្តភ័ក្តមិនសូវសមប្រកបធ្វើការរាជការមិនសូវល្អ បើរកស៊ីជួញដូរដោយប្រាជ្ញាច្រើនល្អប្រសើរ អ្នកផងស្រលាញ់ចូលចិត្ត។"
                    'd' -> resultText.text =
                        "ទំនាយថា ធុនកណ្តាល មិនល្អពេក មិនអាក្រក់ពេក កុំធ្វើគុណដល់ព្រោះច្រើនបានទុក្ខទោសដល់ខ្លួន បើរកស៊ីជួញដូរល្អគួរសម ធ្វើការរាជការមិនសូវល្អ ចូលចិត្តដើរច្រើន ទ្រព្យសម្បត្តិមានមធ្យម តែចិត្តកំណាញ់បន្តិច។"
                    't' -> resultText.text =
                        "ទំនាយថា ជាមនុស្សមានចិត្តស្រាល ឆាប់ខឹង តែមិនចេះមានគំនុំ ច្រើនមានចិត្តក្លាហ៊ាន មុះមុត ហានសំរេចកិច្ចការអ្វីមួយដោយខ្លួនឯង ដោយមិនចាំបាច់ពឹងពាក់អ្នកដទៃ ពីតូចអភ័ព្វញាតិការ លុះក្រោយមកនឹងបានជួបជុំវិញ តែប្រយ័ត្នក្នុងការសេពគបមិត្តព្រោះច្រើននាំទុក្ខទោសដល់ខ្លូន កុំធ្វើគុណអ្នកដ៏ទៃច្រើន បានទោសមកវិញ។"
                    else -> resultText.text = "សូមបញ្ចូលឈ្មោះជាភាសាអង់គ្លេសអោយបានត្រឺមត្រូវ៖"
                }
            } else {
                resultText.text = "សូមបញ្ចូលឈ្មោះជាភាសាអង់គ្លេស"
            }
        }
    }
}
